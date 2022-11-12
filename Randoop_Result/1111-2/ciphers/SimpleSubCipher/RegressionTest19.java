package ciphers.SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\246\250\250\250\246\250\250\250!", "\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250!" + "'", str2, "\246\250\250\250\246\250\250\250!");
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269!", "nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254!" + "'", str2, "UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254!");
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\336\336!!\336\336!!!!\336\336!!\336\336!!!!\200\200\u0346\u0348\u0348!", "\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010enullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull!!nullnull!!!!nullnull!!nullnull!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull!!nullnull!!!!nullnull!!nullnull!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!", "\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!" + "'", str2, "!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!");
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ!", "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!!null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!!null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!!null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!!null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!" + "'", str2, "null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!!null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!!null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!!null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!!null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!");
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``nullnullnullnull``!", "\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!" + "'", str2, "``nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!");
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!", "\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!" + "'", str2, "!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!");
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!", "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!" + "'", str2, "\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU\220\220\216\216\220\220\216\216U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!");
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U]UUU]UU!!U]UUU]UU!!U]UUU]UUU]UUU]UU!!U]UUU]UU!!U]UUU]UU!", "UULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300]\300\300\300]\300\300!!\300]\300\300\300]\300\300!!\300]\300\300\300]\300\300\300]\300\300\300]\300\300!!\300]\300\300\300]\300\300!!\300]\300\300\300]\300\300!" + "'", str2, "\300]\300\300\300]\300\300!!\300]\300\300\300]\300\300!!\300]\300\300\300]\300\300\300]\300\300\300]\300\300!!\300]\300\300\300]\300\300!!\300]\300\300\300]\300\300!");
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254!!!", "LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!!" + "'", str2, "NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!NLLL\256\254\254NLLL\256\254\254!!!");
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!" + "'", str2, "\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!");
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLL!!LLLLLLLL!!!", "\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!!" + "'", str2, "\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!!");
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LL!", "~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}!" + "'", str2, "}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}\275\275}}}\275\275}}}}}\275\275}}!");
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!", "\u023e\u023e\u023e\u023e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!" + "'", str2, "nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!");
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc!", "llllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "X!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWW!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!" + "'", str2, "!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!!nullnull!Wnullnull!Wnullnullnullnull!Wnullnull!Wnullnull!");
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\u0346\u0348\u0348!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!");
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnull!", "LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d!" + "'", str2, "\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d!");
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276!", "\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153nullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNNLNNNLNNN\276LNNNLNNNLNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNN\276LNNNLNNNLNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276!" + "'", str2, "LNNNLNNNLNNNLNNN\276LNNNLNNNLNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNN\276LNNNLNNNLNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276!");
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!", "\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~!" + "'", str2, "\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~!");
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u013d\u013e\u0140\u0140\u013d\u013e\u0140\u0140nullnull!", "nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\362\363\365\365\362\363\365\365\362\363\365\365\362\363\365\365nullnullnullnull\362\363\365\365\362\363\365\365!" + "'", str2, "nullnullnullnull\362\363\365\365\362\363\365\365\362\363\365\365\362\363\365\365nullnullnullnull\362\363\365\365\362\363\365\365!");
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\220\220\215\215\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\220\220\215\215\u0346\u0348\u0348!");
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!", "NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNN!!NNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNN!!!" + "'", str2, "NNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNN!!NNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNNNNNN!NNNNNNNN!!!");
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200!", "\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200!" + "'", str2, "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200!");
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227!", "\u0346\u0348\u0348\u0348`\230\230\230\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227!" + "'", str2, "\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227!");
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214!" + "'", str2, "`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214!");
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnull!", "!ULL!ULL!ULL!ULL!ULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrtt!" + "'", str2, "nullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrtt!");
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaa!", "\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull!" + "'", str2, "\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull!");
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUNNUUNN!!UUNNUUNN!!UUNNUUNNUUNNUUNN!!UUNNUUNN!!UUNNUUNN!", "\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!" + "'", str2, "!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!");
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!RRR!RRR!RRR!RRR```!", "U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!" + "'", str2, "!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!~~~!~~~!~~~!~~~```!");
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLL!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH\200}}`EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHH!" + "'", str2, "HEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHHHEFFHEFFHH!");
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~U~~~U~~~\275\275U~~~U~~~\275\275U~~~U~~~\275\275U~~~U~~~\275\275\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~U~~~U~~~\275\275U~~~U~~~\275\275!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275null~~~null~~~null~~~\275null~~~null~~~null~~~\275null~~~null~~~null~~~\275null~~~null~~~null~~~null~~~null~~~\275\275null~~~null~~~\275\275null~~~null~~~\275\275null~~~null~~~\275\275\275null~~~null~~~null~~~\275null~~~null~~~null~~~\275null~~~null~~~null~~~\275null~~~null~~~null~~~null~~~null~~~\275\275null~~~null~~~\275\275!" + "'", str2, "\275null~~~null~~~null~~~\275null~~~null~~~null~~~\275null~~~null~~~null~~~\275null~~~null~~~null~~~null~~~null~~~\275\275null~~~null~~~\275\275null~~~null~~~\275\275null~~~null~~~\275\275\275null~~~null~~~null~~~\275null~~~null~~~null~~~\275null~~~null~~~null~~~\275null~~~null~~~null~~~null~~~null~~~\275\275null~~~null~~~\275\275!");
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UU!!UU!", "!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!" + "'", str2, "!!UU!!UU!");
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!", "\u0366\u0365\u0368\u0368\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!" + "'", str2, "!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!");
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "UNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!!" + "'", str2, "N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!!");
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256nullnull!!!" + "'", str2, "\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256\u025e\u025d\u0256\u0256nullnull!!!");
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246!", "nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!", "\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!" + "'", str2, "\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!");
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\200\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126]]!", "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253!", "\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aanullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LULLLULL\253\253LULLLULL\253\253LULLLULL\253\253LULLLULL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LULLLULL\253\253LULLLULL\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LULLLULL\253\253LULLLULL\253\253LULLLULL\253\253LULLLULL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LULLLULL\253\253LULLLULL\253\253!");
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!", "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!" + "'", str2, "]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!");
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!" + "'", str2, "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!", "W!XXW!XXW!XXW!XX\200}}`W!XXW!XXW!XXW!XX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]!" + "'", str2, "]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]]hnullffhnullffhnullffhnullff]]!");
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!", "UU]]UU]]UU]]UU]]~}}^UU]]UU]]UU]]UU]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260uu]]uu]]\260\260uu]]uu]]}}\260\260uu]]uu]]\260\260uu]]uu]]}}!" + "'", str2, "\260\260uu]]uu]]\260\260uu]]uu]]}}\260\260uu]]uu]]\260\260uu]]uu]]}}!");
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!!!" + "'", str2, "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!!!");
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]!NN]!NN]!NN]!NN\200}}`]!NN]!NN]!NN]!NN]]!", "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!\271\271]!\271\271]!\271\271]!\271\271\200}}`]!\271\271]!\271\271]!\271\271]!\271\271]]!" + "'", str2, "]!\271\271]!\271\271]!\271\271]!\271\271\200}}`]!\271\271]!\271\271]!\271\271]!\271\271]]!");
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!", "``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!" + "'", str2, "!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!!\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``\230\226``!");
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200nullnullnullnullnullnullnullnull!", "heeeheeeeeheeeheeeeeheeeheeeeeheeeheeeeeheeeheeeeeheeeheeeeeheeeheeeeeheeeheeeee!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d}~\200\200}~\200\200\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u022a\u022b\u022d\u022d\u0348\u0346\u0346!");
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253!", "}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN]]!", "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031aP`PPP`PP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````]]!" + "'", str2, "````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````]]!");
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276!!!", "JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!!" + "'", str2, "nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!nullnullnull\200\200nullnullnullnullnull\200\200nullnull!!!");
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!", "I!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!II\200}}`I!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!II]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!" + "'", str2, "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NUUU!UUU!UUU!UUU!UUUNUUU!UUU!UUU!", "!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNN!NNN!NNN!NNN!NNNNNNN!NNN!NNN!" + "'", str2, "NNNN!NNN!NNN!NNN!NNNNNNN!NNN!NNN!");
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!", "\u0366\u0365\u0368\u0368!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!!!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!!!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!!!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215!\200\276\276\230\200\215\215\230\200\215\215\230\200\215\215\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!", "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u0346\u0348\u0348!", "NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014b!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276null\225\225\276null\225\225\200\200\276null\225\225\276null\225\225\200\200\276null\225\225\276null\225\225\200\200\276\276null\225\225\276null\225\225\200\200\275\275!", "\275\u0108\u0108\u0108\275\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnullnullnull\225\225\276nullnullnullnull\225\225\200\200\276nullnullnullnull\225\225\276nullnullnullnull\225\225\200\200\276nullnullnullnull\225\225\276nullnullnullnull\225\225\200\200\276\276nullnullnullnull\225\225\276nullnullnullnull\225\225\200\200\275\275!" + "'", str2, "\275\276nullnullnullnull\225\225\276nullnullnullnull\225\225\200\200\276nullnullnullnull\225\225\276nullnullnullnull\225\225\200\200\276nullnullnullnull\225\225\276nullnullnullnull\225\225\200\200\276\276nullnullnullnull\225\225\276nullnullnullnull\225\225\200\200\275\275!");
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256nullnullnullnullnullnullnullnullnullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\u0366\u0365\u0368\u0368null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223\u0220\u0221\u0223\u0223!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300!" + "'", str2, "\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300\200\200\300\300!");
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NnullnullnullNnullnullnullNnullnullnullNnullnullnull\200}}`NnullnullnullNnullnullnullNnullnullnullNnullnullnull]]!", "\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\200\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276]]!" + "'", str2, "\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\200\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276\u016c\276\276\276]]!");
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253!", "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253!");
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\246\250\250\250\246\250\250\250!", "\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250!" + "'", str2, "\246\250\250\250\246\250\250\250!");
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!", "H!!!H!!!H!!!H!!!H!!!H!!!H!!!H!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!" + "'", str2, "!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!");
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!", "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!" + "'", str2, "!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!");
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!", "nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "hnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnullhnullffhnullffnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N!!!N!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!!" + "'", str2, "null!!!null!!!!");
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\210\210LLLLL\210\210LLLLL\210\210LLLLL\210\210LLLLL\200}}`\210\210LLLLL\210\210LLLLL\210\210LLLLL\210\210LLLLL]]!", "LNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUULNUULNUU!!LNUULNUU!!\276LNUULNUULNUU\276LNUULNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\200}}`\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad]]!" + "'", str2, "\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\200}}`\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad]]!");
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!", "null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!!`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!!`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!!`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!!`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!" + "'", str2, "`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!!`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!!`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!!`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!!`!UU`!UU`!UU`!UU`!UU`!UU`!UU`!UU!");
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!", "\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!" + "'", str2, "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "!\331\330\333\333\331\330\333\333\331\330\333\333\331\330\333\333!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!eeeeeeeeeeeeeeee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvv!", "~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123nullnull!" + "'", str2, "\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123\u0122\u0123\u0125\u0125\u0123nullnull!");
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^~~~^\220~~^\220~~^\220~~^\220~~^~~~^\220~~^\220~~!", "AA]]AA]]nullnullAA]]AA]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^~~~^\220~~^\220~~^\220~~^\220~~^~~~^\220~~^\220~~!" + "'", str2, "^~~~^\220~~^\220~~^\220~~^\220~~^~~~^\220~~^\220~~!");
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!!FFF!FFF!FFF!FFF~~~!FFF!FFF!FFF!FFF~~~!FFF!FFF!FFF!FFF~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!FFF!FFF!FFF!FFF~~~!FFF!FFF!FFF!FFF~~~!FFF!FFF!FFF!FFF~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!!FFF!FFF!FFF!FFF~~~!FFF!FFF!FFF!FFF~~~!FFF!FFF!FFF!FFF~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!FFF!FFF!FFF!FFF~~~!FFF!FFF!FFF!FFF~~~!FFF!FFF!FFF!FFF~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!\200\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!]]!", "\275``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull\276``nullnullnullnullnullnullnullnull\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!" + "'", str2, "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!");
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!", "~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!" + "'", str2, "\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!");
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240!" + "'", str2, "\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240\u0260\u0260\u0240\u0240!");
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!!", "\u0366\u0365\u0368\u0368\253\253!!\253\253!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!!" + "'", str2, "null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!!");
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!!", "\275\u0180\u0180\u0180\275\u0180\u0180\u0180\275\u0180\u0180\u0180\275\u0180\u0180\u0180\u0180\u0180\275\275\u0180\u0180\275\275\u0180\u0180\275\275\u0180\u0180\275\275\275\u0180\u0180\u0180\275\u0180\u0180\u0180\275\u0180\u0180\u0180\275\u0180\u0180\u0180\u0180\u0180\275\275\u0180\u0180\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!", "LNNNLNNNLNNNLNNN\276LNNNLNNNLNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNN\276LNNNLNNNLNNNLNNNLNNNLNNNLNNN\276\276LNNNLNNNLNNNLNNNLNNN\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!!" + "'", str2, "\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!!");
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\276\276\300\300\276\276}}\300\300\276\276\300\300\276\276}}!", "!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU\276\276UU\276\276}}UU\276\276UU\276\276}}!" + "'", str2, "UU\276\276UU\276\276}}UU\276\276UU\276\276}}!");
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNLLNNLLNNLLNNLL\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02c9\u02c9\u02cc\u02cc\u02c9\u02c9\u02cc\u02cc\u02c9\u02c9\u02cc\u02cc\u02c9\u02c9\u02cc\u02cc\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "\u02c9\u02c9\u02cc\u02cc\u02c9\u02c9\u02cc\u02cc\u02c9\u02c9\u02cc\u02cc\u02c9\u02c9\u02cc\u02cc\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253!");
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d!!!", "~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNN!", "````````````````````````````````````````````````````````````````````````````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!");
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\335nullnullnull\335\u035e\u035enull\335nullnullnull\335\u035e\u035e!!!!null\335nullnullnull\335\u035e\u035enull\335nullnullnull\335\u035e\u035e!", "\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u035e\u035e\u035e\u035e\u035e\u035e\u035e\u035e!" + "'", str2, "\u035e\u035e\u035e\u035e\u035e\u035e\u035e\u035e!");
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("VV!!VV!!!!``VV!!VV!!``VV!!VV!!``VV!!VV!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!``VV!!VV!!``VV!!VV!!``VV!!VV!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!``nullnull!!nullnull!!``nullnull!!nullnull!!``nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!``nullnull!!nullnull!!``nullnull!!nullnull!!``nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!``nullnull!!nullnull!!``nullnull!!nullnull!!``nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!``nullnull!!nullnull!!``nullnull!!nullnull!!``nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLL!!!!UNLLUNLL!", "N\254NNN\254NN!!N\254NNN\254NN!!N\254NNN\254NNN\254NNN\254NN!!N\254NNN\254NN!!N\254NNN\254NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullxnullnullnullxnullnull!!!!nullxnullnullnullxnullnull!" + "'", str2, "nullxnullnullnullxnullnull!!!!nullxnullnullnullxnullnull!");
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!", "UUUU!]UU!]UU!]UU!]UUUUUU!]UU!]UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!" + "'", str2, "~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!");
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e!", "nullUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!", "\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204\u015b\u015c\u015e\u015e\u015b\u015c\u015e\u015e\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "AA]]AA]]nullnullAA]]AA]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``!" + "'", str2, "\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``!");
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!!", "\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!!" + "'", str2, "\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!!");
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!!", "~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179!!!!!!!" + "'", str2, "\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179!!!!!!!");
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!UUU!UUU!UUU\276!UUU\275\275!", "\u02eb\u02ec\u02ee\u02ee\u02cc\u02cb\u02ce\u02ce!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!nullnullnull!nullnullnull!nullnullnull\276!nullnullnull\275\275!" + "'", str2, "\275!nullnullnull!nullnullnull!nullnullnull\276!nullnullnull\275\275!");
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!tttnullnullnullnull!tttnullnull!", "nullnullnullnull\220nullnullnullnullnullnullnullnull\200}}`nullnullnullnull\220nullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull\303\304\306\306\303\304\306\306\303\304\306\306\303\304\306\306!nullnullnull\303\304\306\306\303\304\306\306!" + "'", str2, "!nullnullnull\303\304\306\306\303\304\306\306\303\304\306\306\303\304\306\306!nullnullnull\303\304\306\306\303\304\306\306!");
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!" + "'", str2, "\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!");
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226\230LL\226\230LL\226\230LL\226\230LL]!]]]!]]]!]]\226\230LL\226\230LL\226\230LL\226\230LL]!]]]!]]]!]]!", "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\230~~\226\230~~\226\230~~\226\230~~]!]]]!]]]!]]\226\230~~\226\230~~\226\230~~\226\230~~]!]]]!]]]!]]!" + "'", str2, "\226\230~~\226\230~~\226\230~~\226\230~~]!]]]!]]]!]]\226\230~~\226\230~~\226\230~~\226\230~~]!]]]!]]]!]]!");
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("````````````````````````````````````````````````````````````````````````````````!", "F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````!");
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253!", "!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253\u033c\u033d\u033f\u033f\u033c\u033d\u033f\u033f\253\253!");
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!", "NULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!" + "'", str2, "NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!");
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e!", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!luu!luu!luu!luu!luu!luu!luu!luu!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LL!" + "'", str2, "l!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LL!");
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!", "\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300!" + "'", str2, "\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300!");
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!", "~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!~}\200\200~}\200\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!\276\276!", "!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!\276\276!" + "'", str2, "!!!\276\276!");
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!", "\u0228\u0228\u0228\u0228!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```!", "\260\260uu\260\260uu!!\260\260uu\260\260uu!!\260\260uu\260\260uu\260\260uu\260\260uu!!\260\260uu\260\260uu!!\260\260uu\260\260uu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```!" + "'", str2, "U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```U\260\260\260null\275\275!!!```!");
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U\220LL\200}}`U\220LL]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200}}`null\220nullnull]]!" + "'", str2, "null\220nullnull\200}}`null\220nullnull]]!");
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!", "UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230\200}}`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230]]!" + "'", str2, "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230\200}}`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\225\230\230]]!");
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]!", "\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0]]!" + "'", str2, "\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0\u02a0]]!");
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0348\u0348!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0348\u0348!");
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104!!!!!", "efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!" + "'", str2, "!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!!~HHH~~!!!!~HHH~~!!!!!");
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!", "!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUU!!U!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUU!!U!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUU!!U!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUU!!U!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUU!" + "'", str2, "U!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUU!!U!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUU!!U!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUU!!U!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUU!!U!LL~LU!LLUULU!LLUUU!LL~LU!LLUULU!LLUU!");
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u01ff\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u01ff\u0348\u0346\u0346!");
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!", "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!" + "'", str2, "nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!");
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullHHnullnullHH!", "\u0366\u0365\u0368\u0368!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!!!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\246\246nullnull\246\246nullnullnullnull\246\246nullnull\246\246nullnull!" + "'", str2, "nullnull\246\246nullnull\246\246nullnullnullnull\246\246nullnull\246\246nullnull!");
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214!", "l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!");
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!", "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!" + "'", str2, "!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!");
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214!", "!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214!");
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e]]!", "\230\230\225\225\230\230\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!");
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNN!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LJ!!LJ!!!", "!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0228\u0228null!!!" + "'", str2, "\u0228\u0228null!!!");
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!L!", "\u0366\u0365\u0368\u0368\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0248!" + "'", str2, "\u0248!");
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\200}}`\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266]]!", "~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\200}}`\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266]]!" + "'", str2, "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\200}}`\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266]]!");
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c!", "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!", "\u0366\u0365\u0368\u0368\336\336!!\336\336!!!!\336\336!!\336\336!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!" + "'", str2, "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108```!", "UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```!" + "'", str2, "nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```!");
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN!!\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN!!\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN!!\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN!!\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN!" + "'", str2, "\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN!!\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN!!\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN!!\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN!!\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN\270\270NNNNNNNN!");
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!]]!!]]null!!!null!!!!!]]!!]]null!!!null!!!!", "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]nullnullnullnull!!!nullnullnullnull!!!!!]]!!]]nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "!!]]!!]]nullnullnullnull!!!nullnullnullnull!!!!!]]!!]]nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~LL!~LL\220\220!~LL!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220!~LL!~LL\220\220!~LL!~LL\220\220!", "LUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~UU!~UU\220\220!~UU!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220!~UU!~UU\220\220!~UU!~UU\220\220!" + "'", str2, "!~UU!~UU\220\220!~UU!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220!~UU!~UU\220\220!~UU!~UU\220\220!");
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c!", "\u0420\u0420\u0420\u0420!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull!" + "'", str2, "`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!", "\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!LLU!LL!!U!LLU!LL!!!", "NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0147\u014a\u014a\u0147\u014a\u014a\u0147\u014a\u014a\u0147\u014a\u014a!!!" + "'", str2, "\u0147\u014a\u014a\u0147\u014a\u014a\u0147\u014a\u014a\u0147\u014a\u014a!!!");
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!HHHH!!HH!!HH!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "\u0366\u0365\u0368\u0368\u0240\u0240\u023e\u023e\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!" + "'", str2, "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!");
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL!" + "'", str2, "~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL~}\200\200~}\200\200\u016e\u016e\u016e\u016eLL!");
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!", "\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!" + "'", str2, "\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!");
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0420\u0420\u0420\u0420!!!", "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLL!", "\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106!", "\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\200\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220]]!", "!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!!" + "'", str2, "\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!\260!!!!!!!!!!!!!");
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!" + "'", str2, "!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!");
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullqrttqrttqrttqrttqrttqrttqrttqrttnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullqrttqrttqrttqrttqrttqrttqrttqrtt!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RTRRRTRR!!RTRRRTRR!!RTRRRTRRRTRRRTRR!!RTRRRTRR!!RTRRRTRR!" + "'", str2, "RTRRRTRR!!RTRRRTRR!!RTRRRTRRRTRRRTRR!!RTRRRTRR!!RTRRRTRR!");
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!", "\u0129\u0129\u0129\u0129nullll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!", "\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!!!" + "'", str2, "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!!!");
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!" + "'", str2, "\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!");
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN!", "EnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE!" + "'", str2, "~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE~}\200\200~}\200\200LLEELLEEEELLEELLEEEE!");
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!", "UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!" + "'", str2, "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!");
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!!", "!nullnullnullnullnull\230\230nullnull\230\230nullnull\230\230nullnull\230\230!nullnullnullnullnull\230\230nullnull\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!!" + "'", str2, "\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!!");
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230\200}}`X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230]]!", "\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\200\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\200\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230]]!" + "'", str2, "\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\200\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa\u01aa]]]\225\230\230]]!");
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!", "!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!");
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!", "L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNL!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!" + "'", str2, "!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!");
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR\215}\215\215\215}\215\215!", "~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\215}\215\215\215}\215\215!");
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("E!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLL!", "`^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnull!" + "'", str2, "null!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnull!");
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad!!!", "!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!" + "'", str2, "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!!", "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LULLLULL\253\253LULLLULL\253\253LULLLULL\253\253LULLLULL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LULLLULL\253\253LULLLULL\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253!" + "'", str2, "L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253!!L!\253\253L!\253\253!!L!\253\253L!\253\253!");
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!", "\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!" + "'", str2, "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!");
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!", "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!");
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!", "!\253\256\256\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!" + "'", str2, "!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!");
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!");
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!!!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!!!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!!!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!!!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULL!!UULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULL!!!", "\275\300\300\300\275\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!", "!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!" + "'", str2, "~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!~}\200\200~}\200\200!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!!!");
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100!", "\u016a\u016a\u016a\u016a\u016a\u016aLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348NN!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348NN!");
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!", "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!" + "'", str2, "`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!");
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02e8\u02e3\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3!", "\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!\220\220}}\220\220}}!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02e8\u02e8\u02e8\u02e8\u02e8\u02e8\u02e8\u02e8nullnullnullnullnullnull!" + "'", str2, "\u02e8\u02e8\u02e8\u02e8\u02e8\u02e8\u02e8\u02e8nullnullnullnullnullnull!");
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!", "}~\200\200}~\200\200\u02b1\u02b2\u02b4\u02b4\u02b1\u02b2\u02b4\u02b4}~\200\200}~\200\200\u02b1\u02b2\u02b4\u02b4\u02b1\u02b2\u02b4\u02b4!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!!}~\200\200}~\200\200!!}~\200\200}~\200\200!!}~\200\200}~\200\200!!}~\200\200}~\200\200!!}~\200\200}~\200\200!!}~\200\200}~\200\200!!}~\200\200}~\200\200!!!" + "'", str2, "}~\200\200}~\200\200!!}~\200\200}~\200\200!!}~\200\200}~\200\200!!}~\200\200}~\200\200!!}~\200\200}~\200\200!!}~\200\200}~\200\200!!}~\200\200}~\200\200!!}~\200\200}~\200\200!!!");
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!", "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!", "U~~~U\220~~U\220~~U\220~~U\220~~U~~~U\220~~U\220~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225!", "NLLLULNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225!" + "'", str2, "null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225!");
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!!", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8null```null```null```null```null```null```null```null```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!!" + "'", str2, "\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!!");
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\275nullnull!\275nullnull!\275nullnull!\275nullnull!\275nullnull!", "!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275TT!!TT!!!\275TT!!TT!!!\275TT!!TT!!!\275TT!!TT!!!\275TT!!TT!!!" + "'", str2, "!\275TT!!TT!!!\275TT!!TT!!!\275TT!!TT!!!\275TT!!TT!!!\275TT!!TT!!!");
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!", "!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("II!!II!!II!!II!!II!!II!!II!!II!!!", "````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!", "\u014b!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!" + "'", str2, "!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!!\256nullnullnullnull\254\254\256nullnullnullnull\254\254!");
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("f]fff]ff!!f]fff]ff!!f]fff]fff]fff]ff!!f]fff]ff!!f]fff]ff!", "\253\254\256\256````````````````\253\254\256\256````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull^^\225\230\230nullnull^^\225\230\230nullnull^^\225\230\230nullnull^^\225\230\230\200}}`nullnull^^\225\230\230nullnull^^\225\230\230nullnull^^\225\230\230nullnull^^\225\230\230]]!", "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230\200}}`!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230]]!" + "'", str2, "!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230\200}}`!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230]]!");
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\u0174\u0174\u0174\275\u0174\u0174\u0174!", "U!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!U!LLU!LL!", "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!L!LLL!LL!" + "'", str2, "!!!L!LLL!LL!");
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!", "\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01a0\u0196\u019d\u019dnullnullnullnull!", "\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271!" + "'", str2, "nullnullnullnull\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271!");
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx!", "\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!" + "'", str2, "\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!");
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN\200}}`NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN]]!", "LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````]]!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````\200}}`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````]]!");
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUU!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de!" + "'", str2, "\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01dd\u01de\u01de\u01de\u01dd\u01de\u01de\u01de!");
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170!!\200\200\u0346\u0348\u0348!", "!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\276!\276\276nullnullnull\276!\276\276nullnullnull!!\276!\276\276nullnullnull\276!\276\276nullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\276!\276\276nullnullnull\276!\276\276nullnullnull!!\276!\276\276nullnullnull\276!\276\276nullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHH!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~LLNNNLLLLNNNLLLLNNNLL\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~LLNNNLLLLNNNLLLLNNNLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNN!" + "'", str2, "NLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNNNLNNNNNNLNNNNNNN!");
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0108\u0108\u0106\u0106\u0108\u0108\u0106\u0106!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnull!", "\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340!" + "'", str2, "nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340nullnullnullnull\335\336\340\340\335\336\340\340\335\336\340\340!");
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!", "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!");
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!!", "!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN\200}}`!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!!");
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!", "\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!!!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!!!");
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!nullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368U!!!U!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullinullnullnullinullnullnullinullnullnullinullnullnullinullnullnullinullnullnullinullnullnullinullnull!" + "'", str2, "!!!nullinullnullnullinullnullnullinullnullnullinullnullnullinullnullnullinullnullnullinullnullnullinullnull!");
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!U!!!U!!!U!!\276!U!!\275\275!", "\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!null!!!null!!!null!!\276!null!!\275\275!" + "'", str2, "\275!null!!!null!!!null!!\276!null!!\275\275!");
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!", "]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!" + "'", str2, "!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!");
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!", "\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!", "\u0366\u0365\u0368\u0368null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!!" + "'", str2, "\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!!");
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull\276``nullnullnullnullnullnullnullnull\275\275!", "P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN``!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN``!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276``!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\275\275!" + "'", str2, "\275``!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN``!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN``!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276``!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\275\275!");
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!UU!!UU!", "\u0366\u0365\u0368\u0368!\314\314\314\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!");
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!", "}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246!", "\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153nullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246!" + "'", str2, "\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246!");
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "nullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!!", "!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b!!!!!!" + "'", str2, "\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b\u019b!!!!!!");
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!", "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368vv!!vv!!!!vv!!vv!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368vv!!vv!!!!vv!!vv!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!]]!!]]N!!!N!!!!!]]!!]]N!!!N!!!!", "\275\u010c\u010c\275\u010c\u010c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]null!!!null!!!!!]]!!]]null!!!null!!!!" + "'", str2, "!!]]!!]]null!!!null!!!!!]]!!]]null!!!null!!!!");
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260!", "]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!!]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!!]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!!]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!!]]\223\225\223\223\223\225\223\223]]\223\225\223\223\223\225\223\223!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260!" + "'", str2, "]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225!", "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225!" + "'", str2, "\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225\260\260]]!\260\260]]\260\260]]\260\260]]!\260\260]]\260\260]]\225\225!");
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266!", "!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266!" + "'", str2, "\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014c\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220!", "!eeeeeeeeeeeeeeee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220!" + "'", str2, "\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220!");
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\300\276\276\275\300\276\276!", "\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275null\276\276\275null\276\276!" + "'", str2, "\275null\276\276\275null\276\276!");
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!" + "'", str2, "!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!!\256!nullnullnull!!nullnullnull!nullnullnull\254\254\256!nullnullnull!!nullnullnull!nullnullnull\254\254!");
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0346\u0348\u0348\u0348\u017d\u017d\u017d\u017d\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!", "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037eNNN!!!" + "'", str2, "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037eNNN!!!");
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!", "\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!" + "'", str2, "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!");
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "TQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!", "RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225!", "!\255nullnull!\255nullnull!\255nullnull!\255nullnull!\255nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225!" + "'", str2, "\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\275\276L!UU!L!UUL!UUL!UU!L!UUL!UU\225\225!");
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016enullnull!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLL!" + "'", str2, "nullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLLnullnullnullnullnullnullnullnullNFLLNFLL!");
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!", "NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348]\340\340\340]\340\340\340\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348]\340\340\340]\340\340\340\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200L^\214\214L^\214\214}~\200\200}~\200\200L^\214\214L^\214\214!", "`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\350^\214\214\350^\214\214}~\200\200}~\200\200\350^\214\214\350^\214\214!" + "'", str2, "}~\200\200}~\200\200\350^\214\214\350^\214\214}~\200\200}~\200\200\350^\214\214\350^\214\214!");
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!ffFF!", "\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLUU!" + "'", str2, "!LLUU!");
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnull!", "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!!", "\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230```!\230```\230```\230```\230```!!\230```\230```!!\230```\230```!!\230```\230```!!\230```!\230```\230```\230```\230```!!\230```\230```!!!" + "'", str2, "\230```!\230```\230```\230```\230```!!\230```\230```!!\230```\230```!!\230```\230```!!\230```!\230```\230```\230```\230```!!\230```\230```!!!");
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u0348\u0346\u0346!", "!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!", "\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!" + "'", str2, "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc!", "null\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0150\u0150\u0150\u0150!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLLLNLLLNLLLLL!" + "'", str2, "NLLLNLLLLLNLLLNLLLLL!");
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\200\200\200\200!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200\200\200\200!" + "'", str2, "!\200\200\200\200!");
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200!!!!!", "!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200!!!!!" + "'", str2, "\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200!!!!!");
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`LNLLLNLLLNLL`LNLLLNLLLNLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("WXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XX!", "]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UU!" + "'", str2, "NUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUNUUU\275NUUUNUUUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UUN!UU!");
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`RRPPRRPPRRPP`RRPPRRPPRRPP!", "\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\231\231\220\220\231\231\220\220\231\231\220\220`\231\231\220\220\231\231\220\220\231\231\220\220!" + "'", str2, "`\231\231\220\220\231\231\220\220\231\231\220\220`\231\231\220\220\231\231\220\220\231\231\220\220!");
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!", "\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143!" + "'", str2, "\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143\u0143!");
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!", "null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!!]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!!]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!!]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!!]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!" + "'", str2, "]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!!]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!!]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!!]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!!]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200]]\200!LLL!!LLL!LLL\200\200\200!LLL!!LLL!LLL\200\200!");
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!!", "`}LVUULVUU`}LVUULVUU`}LVUULVUU`}LVUULVUU`}LVUULVUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!!" + "'", str2, "]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!!");
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\344\344\344\275\344\344\344\275\344\344\344\275\344\344\344\344\344\275\275\344\344\275\275\344\344\275\275\344\344\275\275\275\344\344\344\275\344\344\344\275\344\344\344\275\344\344\344\344\344\275\275\344\344\275\275!", "~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275UU\275\275UU\275\275\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275!" + "'", str2, "\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275UU\275\275UU\275\275\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275!");
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehhfehhfehhfehhfehhfehhfehh!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!", "LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!" + "'", str2, "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!");
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!\261\262\264\264NN~~NN~~!!!!\261\262\264\264NN~~NN~~!!!!!!!", "LLLLLJJJLJJJLJJJLJJJLLLLLJJJLJJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!!" + "'", str2, "\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!\261\262\264\264JJ~~JJ~~!!!!\261\262\264\264JJ~~JJ~~!!!!!!!");
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!");
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULLNULLNULLNULL!", "llllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120!" + "'", str2, "\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120!");
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200]]\200\200]]\200\200]]\200\200]]~}}^\200\200]]\200\200]]\200\200]]\200\200]]]]!", "\275LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU\276LNUULNUULNUULNUU\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200]]\200\200]]\200\200]]\200\200]]~}}^\200\200]]\200\200]]\200\200]]\200\200]]]]!" + "'", str2, "\200\200]]\200\200]]\200\200]]\200\200]]~}}^\200\200]]\200\200]]\200\200]]\200\200]]]]!");
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull!", "~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull!" + "'", str2, "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]!" + "'", str2, "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]!");
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!!", "\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!!" + "'", str2, "\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!\266!!!!!\256\256\256\266\266!!\256\256\256\266\266!!!!!!!");
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0150\u0150!", "nullnullnullnullabddabddabddabddnullnullnullnullabddabdd!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullnull!" + "'", str2, "!!!nullnull!");
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!", "\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!");
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!", "lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204LLNN\204\204\204LLNN\204\204!!\204LLNN\204\204\204LLNN\204\204!!\204LLNN\204\204\204LLNN\204\204\204LLNN\204\204\204LLNN\204\204!!\204LLNN\204\204\204LLNN\204\204!!\204LLNN\204\204\204LLNN\204\204!" + "'", str2, "\204LLNN\204\204\204LLNN\204\204!!\204LLNN\204\204\204LLNN\204\204!!\204LLNN\204\204\204LLNN\204\204\204LLNN\204\204\204LLNN\204\204!!\204LLNN\204\204\204LLNN\204\204!!\204LLNN\204\204\204LLNN\204\204!");
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!", "!ffFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!" + "'", str2, "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!");
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!", "~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!" + "'", str2, "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!");
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("vnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxx!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a~~!", "}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~!" + "'", str2, "\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~!");
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!", "\u035e\u035e\u035e\u035e\u035e\u035e\u035e\u035e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "unllunll!!unllunll!!unllunll!!unllunll!!unllunll!!unllunll!!unllunll!!unllunll!!!" + "'", str2, "unllunll!!unllunll!!unllunll!!unllunll!!unllunll!!unllunll!!unllunll!!unllunll!!!");
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU!!\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU!!\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU!!\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU!!\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU!!\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU!!\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU!!\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU!!\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\266\266~LLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!", "!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!!!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!!!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!!!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!!!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!" + "'", str2, "!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!!!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!!!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!!!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!!!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!F!!!F!!FF!");
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`UNUUUNUUUNUU`UNUUUNUUUNUU!", "\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\226\226\226\226\226\226\226\226\226\226\226\226`\226\226\226\226\226\226\226\226\226\226\226\226!" + "'", str2, "`\226\226\226\226\226\226\226\226\226\226\226\226`\226\226\226\226\226\226\226\226\226\226\226\226!");
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243!", "!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200!", "]nullnull!!nullnull!!nullnull!!\200}}`]nullnull!!nullnull!!nullnull!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200!" + "'", str2, "null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200null~\200\200null~\200\200~null\200\200~null\200\200!");
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!!", "\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!!" + "'", str2, "nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!!");
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0170\u0170\u0170\u0170nullnullnullnullnullnullnullnullnull!", "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!" + "'", str2, "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!");
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!nullnullnullnullnullnullnullnull!", "\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118!" + "'", str2, "\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118!");
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275!" + "'", str2, "\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275\233HHHHHHHHHHHH\233HHHHHHHHHHHH\275\275!");
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!!", "]!````````````````!!!````````````````!!!````````````````!!!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]]!````````````````!!!````````````````!!!````````````````!!!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!" + "'", str2, "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!");
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!", "\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!" + "'", str2, "\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!");
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLL\200}}`ULLL]]!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N\253\253\253\200}}`N\253\253\253]]!" + "'", str2, "N\253\253\253\200}}`N\253\253\253]]!");
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnull!", "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!]]!!]]null!!!null!!!!!]]!!]]null!!!null!!!!", "LNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016c\u016e\u0170\u0170\u016c\u016e\u0170\u0170\u016c\u016e\u0170\u0170\u016c\u016e\u0170\u0170!!!!" + "'", str2, "\u016c\u016e\u0170\u0170\u016c\u016e\u0170\u0170\u016c\u016e\u0170\u0170\u016c\u016e\u0170\u0170!!!!");
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!" + "'", str2, "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368UU]]UU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!" + "'", str2, "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!");
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!!", "\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnull!" + "'", str2, "nullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnull!");
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0!", "ULLLULLL!!ULLLULLL!!ULLLULLLULLLULLL!!ULLLULLL!!ULLLULLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nulluuu\225\230nullnull!!nulluuu\225\230nullnull!!!", "!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]L}}LLL\225\230]L}}]L}}!!]L}}LLL\225\230]L}}]L}}!!!" + "'", str2, "]L}}LLL\225\230]L}}]L}}!!]L}}LLL\225\230]L}}]L}}!!!");
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0\u03e0nullnullnullnull!!!", "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!!!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!!!" + "'", str2, "!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!!!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!~ULLLULLLnullULLLULLLULLLULLLULLLULLLnullULLLULLLULLLULLL!!!");
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!", "!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!" + "'", str2, "NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!");
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!", "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!");
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240]]!", "!!!nulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleff!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200!", "\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200!" + "'", str2, "\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200!");
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253!", "nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNN!!LUNNLUNN!!\253\253LUNNLUNN!!LUNNLUNN!!\253\253LUNNLUNN!!LUNNLUNN!!\253\253LUNNLUNN!!LUNNLUNN!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNN!!LUNNLUNN!!\253\253LUNNLUNN!!LUNNLUNN!!\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNN!!LUNNLUNN!!\253\253LUNNLUNN!!LUNNLUNN!!\253\253LUNNLUNN!!LUNNLUNN!!\253\253LUNNLUNN!!LUNNLUNN!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNN!!LUNNLUNN!!\253\253LUNNLUNN!!LUNNLUNN!!\253\253!");
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "UULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!!\256nullnull~~!nullnull~~nullnull~~\254\254\256nullnull~~!nullnull~~nullnull~~\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!", "\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!", "nullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnullee\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!", "NLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!!\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!!\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!!\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!!\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!" + "'", str2, "\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!!\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!!\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!!\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!!\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!");
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\260\260\260\260\u0346\u0348\u0348!");
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215`!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215`!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!" + "'", str2, "`!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215`!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!");
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("TT!!TT!!!", "\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "\215}\215\215\215}\215\215\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!");
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225!", "LLNNLLNNNNLLNNLLNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225!" + "'", str2, "\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225\275\276n!ll!n!lln!lln!ll!n!lln!ll\275\276n!ll!n!lln!lln!ll!n!lln!ll\225\225!");
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223hfhhhfhhhfhh}~\200\200}~\200\200hfhhhfhh\223\223hfhhhfhhhfhhhfhhhfhh\223\223\u0348\u0346\u0346!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223\u0348\u0346\u0346!");
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!!", "EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!!" + "'", str2, "LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!LNUU!LNUULNUULNUU!LNUULNUU!!!");
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!!", "\275LLL\275LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNLLLNLL!!LNLLLNLL!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anullaaanullaa!!anullaaanullaa!!!" + "'", str2, "anullaaanullaa!!anullaaanullaa!!!");
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!", "!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!" + "'", str2, "}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!");
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!!!!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!" + "'", str2, "!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!null!!!null!!!null!!!null!!!!!!null!!!null!!!null!!!null!!!!!!!!");
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("````````````````````````````````!", "!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!" + "'", str2, "````````````````````````````````!");
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!", "nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL}}\275\275\275LL}}\275\275\275!!LL}}\275\275\275LL}}\275\275\275!!LL}}\275\275\275LL}}\275\275\275LL}}\275\275\275LL}}\275\275\275!!LL}}\275\275\275LL}}\275\275\275!!LL}}\275\275\275LL}}\275\275\275!" + "'", str2, "LL}}\275\275\275LL}}\275\275\275!!LL}}\275\275\275LL}}\275\275\275!!LL}}\275\275\275LL}}\275\275\275LL}}\275\275\275LL}}\275\275\275!!LL}}\275\275\275LL}}\275\275\275!!LL}}\275\275\275LL}}\275\275\275!");
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!ffFF!", "\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!\266!!!!!LLL\266\266!!LLL\266\266!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LL!!!" + "'", str2, "!LL!!!");
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~!", "!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~!" + "'", str2, "\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~\226\226~~~~~\226\226~~~~~~~!");
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!!!!!", "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!!!!!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!!!!!");
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!!LL!!LLnullnullnullnullnullnullnullnull!!LL!!LL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!!");
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db]]!", "nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljjnullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljj!", "\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348!" + "'", str2, "\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348\u0348\276\u0348\276\u0348\u0348!");
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e!", "LNLLLNLL!!LNLLLNLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnullnull~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!" + "'", str2, "null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnullnull~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!");
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!`nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "`nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!`nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!!!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!!!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!!!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!!!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!" + "'", str2, "!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!!!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!!!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!!!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!!!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!~}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}!");
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "\253\254\256\256!UUU!UUU!UUU!UUU\253\254\256\256!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!" + "'", str2, "U!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225U~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!" + "'", str2, "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!");
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!", "`LNLLLNLLLNLL`LNLLLNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!" + "'", str2, "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!");
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!!", "]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!!" + "'", str2, "}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!!");
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!" + "'", str2, "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!", "\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\335\336\340\340\335\336\340\340\335\336\340\340\276\335\336\340\340\275\275!", "UN\230\230UUUUN\230\230UUUUN\230\230UUUUN\230\230UUU\200}}`UN\230\230UUUUN\230\230UUUUN\230\230UUUUN\230\230UUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!");
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254!!!", "!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!" + "'", str2, "nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!");
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f!!!", "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!" + "'", str2, "!!!!!!!!!!!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011aLL!", "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275!" + "'", str2, "nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275!");
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`\231\231\220\220\231\231\220\220\231\231\220\220`\231\231\220\220\231\231\220\220\231\231\220\220!", "nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\231\231\220\220\231\231\220\220\231\231\220\220`\231\231\220\220\231\231\220\220\231\231\220\220!" + "'", str2, "`\231\231\220\220\231\231\220\220\231\231\220\220`\231\231\220\220\231\231\220\220\231\231\220\220!");
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!", "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]nullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab!", "NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275]!]]]!]]]!]]\275]!]]]!]]]!]]!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275]!]]]!]]]!]]\275]!]]]!]]]!]]!" + "'", str2, "\275]!]]]!]]]!]]\275]!]]]!]]]!]]!");
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!", "~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!" + "'", str2, "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!", "!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357!" + "'", str2, "null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357null\357\357\357null\357\357\357\357\357!");
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!!", "\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275~~\275\275~~\275\275\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!!" + "'", str2, "~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!~\275~~~\275~~~~~\275~~~\275~~~~!!!");
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLIIILIIILIII!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!!" + "'", str2, "\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!!!");
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!");
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!", "]!H!!!H!!!H!!!H!!!H!!]]!H!!!H!!]]!H!!!H!!]]!H!!!H!!]]]!H!!!H!!!H!!!H!!!H!!]]!H!!!H!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!" + "'", str2, "\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!");
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!!", "vvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuu\200}}`vvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuu]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!!" + "'", str2, "UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!UVUUUVUU!!!");
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300!", "\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull!");
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!" + "'", str2, "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullBBnullnullBB!", "NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0248\u0246\u0246\u0248\u0246\u0246\u0248\u0246\u0246\u0248\u0246\u0246nullnull!" + "'", str2, "\u0248\u0246\u0246\u0248\u0246\u0246\u0248\u0246\u0246\u0248\u0246\u0246nullnull!");
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnullnullnullnullnullnull!", "LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!" + "'", str2, "\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!");
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!" + "'", str2, "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!", "~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!" + "'", str2, "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!");
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hh!!hh!!!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300!!\300\300!!!" + "'", str2, "\300\300!!\300\300!!!");
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215null!!!null!!!null!!!null!!!\215}\215\215\215}\215\215!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215}\215\215\215}\215\215!");
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!||||!!!||||!!!||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!||||!!!||||!!!||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!!" + "'", str2, "||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!||||!!!||||!!!||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!!");
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("oprroprr!!oprroprr!!!", "````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`\216\216!!\216\216!!\216\216!!`\216\216!!\216\216!!\216\216!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\216\216!!\216\216!!\216\216!!`\216\216!!\216\216!!\216\216!!!" + "'", str2, "`\216\216!!\216\216!!\216\216!!`\216\216!!\216\216!!\216\216!!!");
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!", "xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106]]!" + "'", str2, "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106]]!");
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226!!ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226ijll\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!!", "nullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!!" + "'", str2, "NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!NHHHNHHHHH!!HH!!!");
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\253\254\256\256~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200\253\254\256\256~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!", "\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216WW\200\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216WW]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!" + "'", str2, "!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!~null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!");
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340\u0346\u0348\u0348!", "\u0248\u0246\u0246\u0248\u0246\u0246\u0248\u0246\u0246\u0248\u0246\u0246nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214!!nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214!!nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214!!nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214!!nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214!!nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214!!nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214nullnullnullnull\211\212\214\214\211\212\214\214\211\212\214\214\u0346\u0348\u0348!");
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220!", "~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220!" + "'", str2, "nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220!");
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!!", "\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull!", "}nullnullnull~}}^}nullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~!" + "'", str2, "~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~~}\200\200~}\200\200{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~{|~~null{|~~{|~~{|~~null{|~~{|~~{|~~{|~~!");
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440nullnull!", "}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134nullnull!" + "'", str2, "\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134\u0132\u0134nullnull!");
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dcnullnull!", "\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198!!!" + "'", str2, "\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198!!!");
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!nullnull!!nullnull!", "\u017e\u017e\u017e\u017e\u017e\u017e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!hikkhikk!!hikkhikk!" + "'", str2, "!!hikkhikk!!hikkhikk!");
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256LNUULNUULNUULNUU\253\254\256\256LNUULNUU!", "\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!", "\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!" + "'", str2, "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!");
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\276\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\275\275!", "XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\276\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\275\275!" + "'", str2, "\275\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\276\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\275\275!");
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!", "\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehhnullnullfehhfehhnullnull!", "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d!!!", "\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!!" + "'", str2, "nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!nullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnull!!!");
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL\300\300LL\300\300!", "LNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0300\u0300\u0300\u0300nullnull!" + "'", str2, "\u0300\u0300\u0300\u0300nullnull!");
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!!", "FFFFFFFFFFFFFFFF!FFF!FFF!FFF!FFFFFFFFFFFFFFFFFFF!FFF!FFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!\253\254\256\256N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!!", "UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!\253\254\256\256N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!!" + "'", str2, "\253\254\256\256N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!\253\254\256\256N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!!");
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e!", "NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230\200}}`NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!" + "'", str2, "]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!");
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!", "\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!");
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N!!!N!!!!", "LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220LLLL\213\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220!!!\220!!!!" + "'", str2, "\220!!!\220!!!!");
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0106\u0106\u0106!", "\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\260\260!" + "'", str2, "\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\260\260!");
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u0348\u0346\u0346!", "\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146!!!!!!!", "\275\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\276\u014c\u014b\u014e\u014e\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!");
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnull!!nullnullnullnullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\230!", "nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\230!" + "'", str2, "!\230!");
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143!!!", "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256!" + "'", str2, "\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256!");
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\200}}`nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\200}}`nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]!");
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~!!!~!!!~!!!~!!!~!!!~!!!~!!!~!!!!", "\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``\230!\225\225\230!\225\225^]``^]``^]``^]``^]``^]``^]``^]``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!!!~!!!~!!!~!!!~!!!~!!!~!!!~!!!!" + "'", str2, "~!!!~!!!~!!!~!!!~!!!~!!!~!!!~!!!!");
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170!!\200\200\u0346\u0348\u0348!", "}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d!", "`RRPPRRPPRRPP`RRPPRRPPRRPP!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!", "h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufllh~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!" + "'", str2, "!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!!~~!!~~!!!~~!!~~!!~~!!!~~!!~~!!~~!");
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!", "ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!" + "'", str2, "!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!");
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!" + "'", str2, "!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!");
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UUUUUUUU\253\253UUUUUUUU\253\253UUUUUUUU\253\253UUUUUUUU\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UUUUUUUU\253\253UUUUUUUU\253\253!", "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!");
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!", "null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnullnull~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!!null~LLnullnullLLnullnullnull~LLnullnullLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!");
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216WW\200\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216WW]]!", "NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230\200}}`NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216NN\200\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216NN]]!" + "'", str2, "\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216NN\200\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216\u0348\u0348~~N\220\216\216\216NNN\220\216\216\216NNN\220\216\216\216NN]]!");
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!", "\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!" + "'", str2, "\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!!\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220\213\213\220\220!");
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!" + "'", str2, "!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!");
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!", "\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!", "\u0366\u0365\u0368\u0368\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e!", "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull!" + "'", str2, "]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull!");
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!", "\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u0348\u0346\u0346!", "fhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}~\200\200}~\200\200\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}~\200\200}~\200\200\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}~\200\200}~\200\200\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}~\200\200}~\200\200\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}~\200\200}~\200\200\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}~\200\200}~\200\200\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u0348\u0346\u0346!");
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276!!!", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!!" + "'", str2, "null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!!");
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!" + "'", str2, "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!", "\u0366\u0365\u0368\u0368\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!" + "'", str2, "!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!!\256\u011anullnull\254\254\256\u011anullnull\254\254!");
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!", "\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230!", "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230!" + "'", str2, "NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230!");
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253!", "H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275!", "PPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNNPPNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276P\275\275\276P\275\275\276P\275\275\276P\275\275\276P\275\275\276P\275\275\276P\275\275\276P\275\275!" + "'", str2, "\276P\275\275\276P\275\275\276P\275\275\276P\275\275\276P\275\275\276P\275\275\276P\275\275\276P\275\275!");
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!", "\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`L```L``!!`L```L``!!`L```L```L```L``!!`L```L``!!`L```L``!", "\u0175\u0175\u0175\u0175!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`null```null``!!`null```null``!!`null```null```null```null``!!`null```null``!!`null```null``!" + "'", str2, "`null```null``!!`null```null``!!`null```null```null```null``!!`null```null``!!`null```null``!");
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a!!!", "\u0346\u0346null!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!", "\204\204\201\201\204\204\201\201!!\204\204\201\201\204\204\201\201!!\204\204\201\201\204\204\201\201\204\204\201\201\204\204\201\201!!\204\204\201\201\204\204\201\201!!\204\204\201\201\204\204\201\201!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!" + "'", str2, "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!");
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!", "\u0346\u0346!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!" + "'", str2, "null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!");
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0366\u0365\u0368\u0368\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256null\367nullnullnull\367nullnullnull\367nullnullnull\367nullnull\253\254\256\256null\367nullnullnull\367nullnull!", "!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnull\367nullnullnullnullnullnullnullnullnullnullnullnull\367nullnullnullnullnullnullnullnullnullnullnullnull\367nullnullnullnullnullnullnullnullnullnullnullnull\367nullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnull\367nullnullnullnullnullnullnullnullnullnullnullnull\367nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnull\367nullnullnullnullnullnullnullnullnullnullnullnull\367nullnullnullnullnullnullnullnullnullnullnullnull\367nullnullnullnullnullnullnullnullnullnullnullnull\367nullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnull\367nullnullnullnullnullnullnullnullnullnullnullnull\367nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!!", "!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102nullnull!!!" + "'", str2, "\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102\u0102nullnull!!!");
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu!", "HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH!" + "'", str2, "~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH~}\200\200~}\200\200HHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HHHHHH!HHHHHHHHHHHH!HHHHHHHH!^HH!^HH!");
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!", "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!!" + "'", str2, "\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!\230\225\225\225\230\225\225\225!!!");
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LL!!!", "\215}\215\215\215}\215\215null!!!null!!!null!!!null!!!\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!aa!!!" + "'", str2, "!aa!!!");
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!", "\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!");
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!^```!!!^```!!!^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!!", "FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!^```!!!^```!!!^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!!" + "'", str2, "^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!^```!!!^```!!!^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!!");
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!", "\u0366\u0365\u0368\u0368ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!");
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\200}}`\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314]]!", "!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!```!!!`!```!!`!```!!`!```!!!`!```!!`!```!!`!```!!!`!```!!`!```!!`!```!!!`!```!!`!```!!\200}}``!```!!!`!```!!`!```!!`!```!!!`!```!!`!```!!`!```!!!`!```!!`!```!!`!```!!!`!```!!`!```!!]]!" + "'", str2, "`!```!!!`!```!!`!```!!`!```!!!`!```!!`!```!!`!```!!!`!```!!`!```!!`!```!!!`!```!!`!```!!\200}}``!```!!!`!```!!`!```!!`!```!!!`!```!!`!```!!`!```!!!`!```!!`!```!!`!```!!!`!```!!`!```!!]]!");
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!!", "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!!" + "'", str2, "\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!\200null!!!null!!!null!!!!");
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253!", "\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\253\253\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\253\253\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\253\253\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\253\253\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\253\253\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\253\253\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\253\253\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\253\253\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\u01f6\u0198\u0196\u0196\u01f6\u0198\u0196\u0196\276\276\253\253!");
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!", "\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!" + "'", str2, "!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!");
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\215}\215\215\215}\215\215!", "nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\215}\215\215\215}\215\215!");
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EEEEEEEE!", "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253!" + "'", str2, "\253\253\253\253\253\253\253\253!");
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "null\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271\266UNUU\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null~}\200\200nullnullnull~}\200\200nullnull!", "\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U!!~}\200\200!U!!!U!!!U!!~}\200\200!U!!!U!!!" + "'", str2, "!U!!~}\200\200!U!!!U!!!U!!~}\200\200!U!!!U!!!");
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200\u0348\u0346\u0346!", "\u0228\u0228null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull``nullnullnull``nullnull``nullnull``nullnullnull``nullnull``}~\200\200}~\200\200nullnull``nullnullnull``nullnull``nullnull``nullnullnull``nullnull``}~\200\200}~\200\200nullnull``nullnullnull``nullnull``nullnull``nullnullnull``nullnull``}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull``nullnullnull``nullnull``nullnull``nullnullnull``nullnull``}~\200\200}~\200\200nullnull``nullnullnull``nullnull``nullnull``nullnullnull``nullnull``}~\200\200}~\200\200nullnull``nullnullnull``nullnull``nullnull``nullnullnull``nullnull``}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!", "\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215]]]]]]]]]]]]]]]]\215}\215\215\215}\215\215!", "}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215]]]]]]]]]]]]]]]]\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215]]]]]]]]]]]]]]]]\215}\215\215\215}\215\215!");
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!", "\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215\230N\215\215UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215!" + "'", str2, "\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215!");
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx!", "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!", "nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!" + "'", str2, "\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!!\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~\216\216`~~~`~~~!");
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!");
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!", "nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!" + "'", str2, "LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!");
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "HH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271\266HnullHH\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!" + "'", str2, "U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!");
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LL!", "mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!", "\u0107\u0105\u0109\u0109\u0107\u0105\u0109\u0109!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!" + "'", str2, "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!");
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014b\u014c\u014e\u014e\u014b\u014c\u014e\u014e!", "!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!!!~\200\327\330\332\332~~\200\327\330\332\332~~!~\200\327\330\332\332~~\200\327\330\332\332~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0}}!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u01a0\u01a0\u01a0\u01a0\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u01a0\u01a0\u01a0\u01a0\u0346\u0348\u0348!");
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u0346\u0348\u0348!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225!", "null!nullnullnull!nullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\264\264\225\225\264\264\225\225\264\264\225\225\264\264\225\225\264\264\225\225\264\264\225\225\264\264\225\225\264\264\225\225!" + "'", str2, "\264\264\225\225\264\264\225\225\264\264\225\225\264\264\225\225\264\264\225\225\264\264\225\225\264\264\225\225\264\264\225\225!");
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!", "~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!" + "'", str2, "!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!");
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]!", "U!!!U!!!\254\254U!!!U!!!\254\254]]U!!!U!!!\254\254U!!!U!!!\254\254]]\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254]]U!!!U!!!\254\254U!!!U!!!\254\254]]\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\u012f\u012f\u012f\u012f\u012f\u012f\u012f\u012fnullnullnull]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\u012f\u012f\u012f\u012f\u012f\u012f\u012f\u012fnullnullnull]]!" + "'", str2, "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\u012f\u012f\u012f\u012f\u012f\u012f\u012f\u012fnullnullnull]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\u012f\u012f\u012f\u012f\u012f\u012f\u012f\u012fnullnullnull]]!");
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!", "UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254UNLLUNLL\254\254\256UNLL\254\254\256UNLL\254\254\256UNLL\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!" + "'", str2, "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8nullnull!", "~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FF!" + "'", str2, "nullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FF!");
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!" + "'", str2, "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!", "eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!" + "'", str2, "!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!");
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }
}
