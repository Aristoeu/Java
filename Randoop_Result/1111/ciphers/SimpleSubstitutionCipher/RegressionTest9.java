package ciphers.SimpleSubstitutionCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!", "\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!" + "'", str2, "\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!");
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200!!!!", "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!", "H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("N!LLN!LL!", "nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!``]!``!" + "'", str2, "]!``]!``!");
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!", "NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!", "U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230\200}}`U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!" + "'", str2, "\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!");
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnullee\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "T!!!T!!!T!!!T!!!T!!!T!!!T!!!T!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!", "!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("unulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluu!", "\253\254\256\256N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!\253\254\256\256N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNN!" + "'", str2, "N!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNN!");
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!", "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!" + "'", str2, "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!", "\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dcnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!" + "'", str2, "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUXXUUXXXXUUXXUUXXXX!", "\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02bd\u02bd\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\ua7b2\ua7b2!" + "'", str2, "\u02bd\u02bd\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\ua7b2\ua7b2!");
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!", "~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!" + "'", str2, "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!", "\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!" + "'", str2, "!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!");
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!", "nullnullLULLLULLLULLLULLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!" + "'", str2, "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214!", "N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!");
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!", "\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull!" + "'", str2, "`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull!");
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljjnullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljj!", "EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225!", "\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225!" + "'", str2, "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225!");
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UL!!UL!!!", "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LJ!!LJ!!!" + "'", str2, "LJ!!LJ!!!");
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("JILLJILLJILLJILLJILLJILLJILLJILL!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce!" + "'", str2, "\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce!");
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!", "````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347!", "~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200!" + "'", str2, "~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200!");
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!", "!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!" + "'", str2, "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull!", "nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]!" + "'", str2, "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]!");
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!!", "~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!" + "'", str2, "`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!");
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!" + "'", str2, "!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!");
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!" + "'", str2, "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!");
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!\200}}`!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!]]!", "\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!\200}}`!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!]]!" + "'", str2, "!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!\200}}`!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!]]!");
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HH!!HH!!!", "nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!!", "\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!!" + "'", str2, "}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!!");
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!" + "'", str2, "UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!");
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!", "porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230!" + "'", str2, "~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230!");
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!", "\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U~LLU~LL!!U~LLU~LL!!U~LLU~LLU~LLU~LL!!U~LLU~LL!!U~LLU~LL!" + "'", str2, "U~LLU~LL!!U~LLU~LL!!U~LLU~LLU~LLU~LL!!U~LLU~LL!!U~LLU~LL!");
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!", "LNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!" + "'", str2, "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!" + "'", str2, "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FHHHnullnullnullnullFHHHnullnull!", "ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnullnullnullnullnull\204\204nullnull\204\204!" + "'", str2, "nullnullnullnullnullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnullnullnullnullnull\204\204nullnull\204\204!");
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LIIILIII!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Lnullnull!Lnullnull!Lnullnull!Lnullnull!Lnullnull!" + "'", str2, "!Lnullnull!Lnullnull!Lnullnull!Lnullnull!Lnullnull!");
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "\234!nullnull\234!nullnull!!\234!nullnull\234!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjj!" + "'", str2, "hgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjj!");
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff!", "ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320nullnullnull!" + "'", str2, "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320nullnullnull!");
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!", "\u016a\u016a\u016a\u016a\u016a\u016aLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225!", "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225!" + "'", str2, "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225!");
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0346\u0348\u0348!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!", "\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a!!!" + "'", str2, "\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a!!!");
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\276!\340\340\276!\340\340\276!\340\340\276!\340\340!", "FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!nullnull\276!nullnull\276!nullnull\276!nullnull!" + "'", str2, "!\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!null`nullnullnull`nullnullnull`nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!null`nullnullnull`nullnullnull`nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!null`nullnullnull`nullnullnull`nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!null`nullnullnull`nullnullnull`nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HH!!HH!!!", "JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214!", "\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214!" + "'", str2, "\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214\u023d\u023e\u0240\u0240null\214\214!");
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UUUUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!", "!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF\200}}`!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF!HFF]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!", "null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!" + "'", str2, "\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!");
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!!", "u`uu`UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300!", "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNNNLNNN!", "\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!" + "'", str2, "\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!");
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!");
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!", "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!" + "'", str2, "\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!");
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!!!", "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!!" + "'", str2, "\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!!");
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("W!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XX!", "XXUUXXUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FF!" + "'", str2, "null!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FF!");
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\230!", "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\230!" + "'", str2, "!\230!");
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLLULLLULLL}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLL!", "!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!HHH!HHH}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!" + "'", str2, "}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!HHH!HHH}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!");
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("RRRRRRRR!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6nullnullnullnullnullnullnullnull!", "!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL!" + "'", str2, "\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL!");
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!", "!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnullx~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnull!" + "'", str2, "x~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnullx~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnull!");
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200\253\254\256\256~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200!" + "'", str2, "\253\254\256\256~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200\253\254\256\256~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200!");
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!", "N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull}}\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull}}!" + "'", str2, "\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull}}\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull}}!");
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u013d\u013e\u0140\u0140\u013d\u013e\u0140\u0140nullnull!", "U!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0!" + "'", str2, "\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0!");
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!", "\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!" + "'", str2, "``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!");
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259!", "UN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!" + "'", str2, "!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!");
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBB!", "UNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!" + "'", str2, "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnull!", "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!" + "'", str2, "\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!");
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0346!!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346!!!!" + "'", str2, "\u0346\u0346!!!!");
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!", "nullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljjnullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljj!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!" + "'", str2, "!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!");
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HFFFHFFF!", "NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!", "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226!");
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!!", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL\200}}`NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!!" + "'", str2, "NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!!");
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("efhhefhhefhhefhhefhhefhhefhhefhh!", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!" + "'", str2, "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!");
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!", "N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!");
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("H!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HH!", "]`^^]`^^!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!" + "'", str2, "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!");
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!", "nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!!nullnullnullnullnullnullnullnullu\253llu\253llnullnullnullnullnullnullnullnullu\253llu\253ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!", "N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!" + "'", str2, "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!");
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!", "FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01a0\u0196\u019d\u019dnullnullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336!", "nullN!!!nullnullnullN!!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull!" + "'", str2, "\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull!");
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!", "\u0346\u0348\u0348\u0348\u0248\u0246\u0246\u0246\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!" + "'", str2, "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!", "ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!" + "'", str2, "\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!");
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\367!\372\372\367!\372\372!", "!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\367!nullnull\367!nullnull!" + "'", str2, "\367!nullnull\367!nullnull!");
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull!", "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU!" + "'", str2, "\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU\215\216\230\230\276UNUUUNUUUNUU\276UNUUUNUUUNUU\276UNUUUNUUUNUU!");
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "H!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368null\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368null\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!Lnullnull!Lnullnull!Lnullnull!Lnullnull!Lnullnull!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c!" + "'", str2, "\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c!");
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnull!" + "'", str2, "ULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnull!");
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHH!", "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "llllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLL!" + "'", str2, "llllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLL!");
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("f]fff]ff!!f]fff]ff!!f]fff]fff]fff]ff!!f]fff]ff!!f]fff]ff!", "\u0104\u0104!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214!", "nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214!" + "'", str2, "\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214!");
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!", "UUNNUUNN!!UUNNUUNN!!UUNNUUNNUUNNUUNN!!UUNNUUNN!!UUNNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnull!" + "'", str2, "nullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnull!");
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!!!", "u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!" + "'", str2, "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0240\u0240\u023e\u023e\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0240\u0240\u023e\u023e\u0346\u0348\u0348!");
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "\u0179\u0178\u0178\u0178\u0179\u0178\u0178\u0178!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256!", "HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("AA]]AA]]nullnullAA]]AA]]nullnull!", "~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230~}\200\200~}\200\200null}\200\200null}\200\200\230\230null}\200\200null}\200\200\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b!" + "'", str2, "\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b\u0198\u0199\u019b\u019b!");
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!", "\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!" + "'", str2, "]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!");
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("WZZZ\200}}`WZZZ]]!", "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016dnullnullnullnullnullnullnullnull!", "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!", "N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!" + "'", str2, "!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!");
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "null\226\230\230nullnullnullnull\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230nullnullnullnull\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!" + "'", str2, "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!", "L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!");
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!", "\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!", "!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnull!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUU!" + "'", str2, "NLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUU!");
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0129\u0129\u0129\u0129nullll!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!");
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN\200}}`!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\256nullnullnull!", "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUU\256LLUULLUULLUU!" + "'", str2, "LLUU\256LLUULLUULLUU!");
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!", "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!" + "'", str2, "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368null\213\213\213\u0346\u0348\u0348!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225N~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300\u0346\u0348\u0348!");
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!", "\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264!" + "'", str2, "\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264!");
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!", "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!!\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!");
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "hgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjj!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUU!", "}UNLLUNLLUNLL~}}^}UNLLUNLLUNLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LL!" + "'", str2, "L~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LL!");
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!", "\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!" + "'", str2, "NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!");
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "fehhfehhnullnullfehhfehhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!", "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!" + "'", str2, "\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!");
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!!!nullnull!", "UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULL!!!!UULLUULL!" + "'", str2, "UULLUULL!!!!UULLUULL!");
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULL!", "U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01ddnullnull!" + "'", str2, "\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01ddnullnull!");
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!", "L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!" + "'", str2, "\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!");
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!tttnullnullnullnull!tttnullnull!", "L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnull\230\230nullnull\230\230nullnull\230\230nullnull\230\230!nullnullnullnullnull\230\230nullnull\230\230!" + "'", str2, "!nullnullnullnullnull\230\230nullnull\230\230nullnull\230\230nullnull\230\230!nullnullnullnullnull\230\230nullnull\230\230!");
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!eeeeeeeeeeeeeeee!", "NULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!", "~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!" + "'", str2, "\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!");
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200!", "}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}ll}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200u}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}ll}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200!" + "'", str2, "u}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}ll}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200u}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}ll}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200!");
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!UU!!U!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!" + "'", str2, "NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!");
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "fehhfehhnullnullfehhfehhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!", "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!", "~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!");
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!", "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!" + "'", str2, "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!");
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("P\220NN\200}}`P\220NN]]!", "NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220xx\200}}`null\220xx]]!" + "'", str2, "null\220xx\200}}`null\220xx]]!");
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!", "NULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!!" + "'", str2, "TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!!");
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!", "U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!" + "'", str2, "!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!");
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!", "!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!", "^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0289\u028a\u028c\u028c!", "}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!", "nullnull!!!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225!" + "'", str2, "u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225!");
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!!", "}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!", "!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!!\214\214!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230!" + "'", str2, "~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230!");
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullll!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!!");
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!", "UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!" + "'", str2, "\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!");
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\226!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\226!" + "'", str2, "!\226!");
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!", "nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!");
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!", "!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!", "NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!" + "'", str2, "!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!");
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!!", "UNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!!" + "'", str2, "\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!!");
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!", "]f!!]f!!!!]f!!]f!!!!]f!!]f!!]f!!]f!!!!]f!!]f!!!!]f!!]f!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnull!" + "'", str2, "v!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnull!");
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!", "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!" + "'", str2, "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!HHHH!", "\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!!", "~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!!" + "'", str2, "UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!!");
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253!");
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0128\u0128\u0128\u0128\u0346\u0348\u0348!", "FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT}~\200\200}~\200\200TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT!" + "'", str2, "}~\200\200}~\200\200TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT}~\200\200}~\200\200TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT!");
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!", "\u0366\u0365\u0368\u0368UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143!!!" + "'", str2, "\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143!!!");
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!", "nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!" + "'", str2, "\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!");
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\234\235\237\237\u0348\u0346\u0346!", "efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\234\235\237\237\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\234\235\237\237\u0348\u0346\u0346!");
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!", "\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!", "\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356\200}}`\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!" + "'", str2, "\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!");
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FF]]FF]]FF]]FF]]~}}^FF]]FF]]FF]]FF]]]]!", "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!" + "'", str2, "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!");
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt!" + "'", str2, "\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt!");
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\214\214!!\214\214!!\214\214!!\214\214\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\214\214!!\214\214!!\214\214!!\214\214\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\214\214!!\214\214!!\214\214!!\214\214\u0346\u0348\u0348!");
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!", "!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!" + "'", str2, "!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!");
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!", "LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``!" + "'", str2, "UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``!");
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnullnullnullnullnull\204\204nullnull\204\204!", "!tttnullnullnullnull!tttnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204!");
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull!", "nullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL!" + "'", str2, "~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL!");
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("fhnullnullfhnullnullfhnullnullfhnullnull~}}^fhnullnullfhnullnullfhnullnullfhnullnull]]!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa]]!" + "'", str2, "\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa]]!");
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af]]null!nullnullnullnull!!!", "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!!" + "'", str2, "nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!!");
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!eeeeeeeeeeeeeeee!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!", "nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!" + "'", str2, "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!");
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256!" + "'", str2, "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!", "UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368N!!!N!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368N!!!N!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e\u013b\u013e\u013e!!!", "nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!!!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!!!" + "'", str2, "!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!!!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!!!");
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!", "\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!");
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~!", "!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~!" + "'", str2, "\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~!");
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010cnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLL\276LLLLLLL\276\276LLLLL\276\276LLLLL\276\276LLLLL\276\276LLLL\276LLLLLLL\276\276LLLLL\276\276!", "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276!" + "'", str2, "nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276!");
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220!" + "'", str2, "\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220!");
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\300\300\300\276\300\275\275!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLL\276L\275\275!" + "'", str2, "\275LLL\276L\275\275!");
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull\340\335nullnull!", "\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNN!", "UL!!UL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!", "\u0143\u0145\u0145\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0143\u0145\u0145\u0145\u0143\u0145\u0143!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!", "!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220!!!" + "'", str2, "\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220!!!");
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253!");
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NULLNULL!", "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!", "!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!" + "'", str2, "~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!");
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!" + "'", str2, "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!");
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!", "H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!", "!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!" + "'", str2, "!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!");
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!" + "'", str2, "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!", "\u03dd\u03de\u03e0\u03e0nullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!" + "'", str2, "\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!");
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "LUUULUUULUUULUUULUUULUUULUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!", "!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!!N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!!N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!!N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!!N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!" + "'", str2, "N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!!N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!!N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!!N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!!N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!");
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!" + "'", str2, "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!");
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("Lu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!ll!", "ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Le!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!ll!" + "'", str2, "Le!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!ll!");
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRR!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!", "!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!", "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!" + "'", str2, "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!", "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318!" + "'", str2, "\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318!");
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275!", "nullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275!" + "'", str2, "\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275!");
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!", "LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230\200}}`LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!" + "'", str2, "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!");
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN\200}}`!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!" + "'", str2, "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!", "!!!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!" + "'", str2, "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!");
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNN!", "!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!" + "'", str2, "!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!");
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("f]fff]ff!!f]fff]ff!!f]fff]fff]fff]ff!!f]fff]ff!!f]fff]ff!", "`^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f!!!" + "'", str2, "\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f!!!");
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108nullnull!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!" + "'", str2, "nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!");
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336\300\300\300\300\336\300\300!", "hehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```!", "NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0!!!```!" + "'", str2, "\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0!!!```!");
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!", "bnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!!UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!!UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!!UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!!UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!" + "'", str2, "UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!!UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!!UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!!UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!!UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!");
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll!", "~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200!" + "'", str2, "\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200!");
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128\u0348\u0346\u0346!", "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u0348\u0346\u0346!");
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275LLL\275LLL!", "NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0108\u0108\u0108\275\u0108\u0108\u0108!" + "'", str2, "\275\u0108\u0108\u0108\275\u0108\u0108\u0108!");
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016enullnull!", "nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\200}}`\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d!!!", "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200null!nullnullnullnull!!!" + "'", str2, "\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200null!nullnullnullnull!!!");
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLUUNLUU!", "!!!lll!lll!lll!lll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!" + "'", str2, "LL!!LL!!!");
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!", "P!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnullP!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340!" + "'", str2, "\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340!");
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!", "UUUU!]UU!]UU!]UU!]UUUUUU!]UU!]UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!" + "'", str2, "~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!");
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!", "UNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368n!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll!!n!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll!!n!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll!!n!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll\204\204\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368n!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll!!n!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll!!n!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll!!n!lln!lln!lln!lln!lln!lln!lln!ll\204\204n!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!lln!ll\204\204\u0346\u0348\u0348!");
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!", "\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\200\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!", "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!" + "'", str2, "!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!\253!!!\253!!!!!");
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\246\250\250\250\246\250\250\250!", "nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250!" + "'", str2, "\246\250\250\250\246\250\250\250!");
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!", "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!" + "'", str2, "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("P\220NN\200}}`P\220NN]]!", "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200}}`null\220nullnull]]!" + "'", str2, "null\220nullnull\200}}`null\220nullnull]]!");
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUU!", "\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "NLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!", "u\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!" + "'", str2, "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!");
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0108!", "\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01ddnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNN!", "\u0366\u0365\u0368\u0368\336\336!!\336\336!!!!\336\336!!\336\336!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!" + "'", str2, "!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!");
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "UNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!", "\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!" + "'", str2, "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!");
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\356\355\360\360\356\355\360\360\356\355\360\360\356\355\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\355\360\360\356\355\360\360\356\355\360\360\356\355\360\360\356\360\360\360\356\360\360\360!", "\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!", "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!" + "'", str2, "!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!");
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLLLL]NNL]NNL]NNL]NNNLLLL]NNL]NN!", "\u0366\u0365\u0368\u0368\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\300\300\300\300]!!\300]!!\300]!!\300]!!!\300\300\300\300]!!\300]!!!" + "'", str2, "!\300\300\300\300]!!\300]!!\300]!!\300]!!!\300\300\300\300]!!\300]!!!");
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!", "efhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnullULLLnullnullnull!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFF!" + "'", str2, "EHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFF!");
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!" + "'", str2, "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!");
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!", "\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200null!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!" + "'", str2, "\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!");
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!", "\u0366\u0365\u0368\u0368\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!!" + "'", str2, "\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!!");
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\276!\340\340\276!\340\340\276!\340\340\276!\340\340!", "}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!~~\276!~~\276!~~\276!~~!" + "'", str2, "!\276!~~\276!~~\276!~~\276!~~!");
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnull!!!", "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnullnullnullnullnullnullnull!!!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348ll!", "\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348LL!" + "'", str2, "\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348LL!");
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "unulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LUUULUUULUUULUUU\200}}`LUUULUUULUUULUUU]]!", "!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214!", "}~\200\200}~\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH}~\200\200}~\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214!" + "'", str2, "HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214!");
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!" + "'", str2, "]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!");
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!", "\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc!" + "'", str2, "\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc\u03dc!");
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!!HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!!HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!!HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!!HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0}}!!!" + "'", str2, "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0}}!!!");
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!", "\275null~}}null~}}\200\200null~}}null~}}\200\200null~}}null~}}\200\200\276null~}}null~}}\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUU!", "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnn!" + "'", str2, "ppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnn!");
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN]]!", "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\200\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0]]!" + "'", str2, "\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\200\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0]]!");
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356\200}}`\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356]]!", "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\275!!\275\275!!!!\275\275!!\275\275!!!!!", "!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN\200}}`!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!");
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!!", "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!!" + "'", str2, "NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!!");
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c!!!", "\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "\u0366\u0365\u0368\u0368\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!!", "!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!" + "'", str2, "!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!");
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!!", "nullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!");
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("II!!II!!II!!II!!II!!II!!II!!II!!!", "\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("f]fff]ff!!f]fff]ff!!f]fff]fff]fff]ff!!f]fff]ff!!f]fff]ff!", "NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n]nnn]nn!!n]nnn]nn!!n]nnn]nnn]nnn]nn!!n]nnn]nn!!n]nnn]nn!" + "'", str2, "n]nnn]nn!!n]nnn]nn!!n]nnn]nnn]nnn]nn!!n]nnn]nn!!n]nnn]nn!");
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "]]AA]]AA!!]]AA]]AA!!]]AA]]AA]]AA]]AA!!]]AA]]AA!!]]AA]]AA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128!", "\u0228\u0228\u0228\u0228nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UULLUULL!!!!UULLUULL!", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u035e\u035e\u035e\u035e\u035e\u035e\u035e\u035e!" + "'", str2, "\u035e\u035e\u035e\u035e\u035e\u035e\u035e\u035e!");
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!" + "'", str2, "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!");
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0126\u0128\u0128\u0126\u0128\u0128!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~}\200\200nullnullnull~}\200\200nullnull!" + "'", str2, "null~}\200\200nullnullnull~}\200\200nullnull!");
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!", "\u0366\u0365\u0368\u0368\336\336!!\336\336!!!!\336\336!!\336\336!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!" + "'", str2, "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\226\226\226\226\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\226\226\226\226\u0348\u0346\u0346!");
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!", "~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!", "nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!" + "'", str2, "ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!");
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe!!!```!", "~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!" + "'", str2, "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]!", "\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]!" + "'", str2, "]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]!");
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\200\230\230\200\200\230\230!", "\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\230\230\200\200\230\230!" + "'", str2, "\200\200\230\230\200\200\230\230!");
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull!", "ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nulllulllulllull^nulllulllulllullnulllulllulllullnulllulllulllull^nulllulllulllullnulllulllulllull}~\200\200}~\200\200nulllulllulllull^nulllulllulllullnulllulllulllullnulllulllulllull^nulllulllulllullnulllulllulllull!" + "'", str2, "}~\200\200}~\200\200nulllulllulllull^nulllulllulllullnulllulllulllullnulllulllulllull^nulllulllulllullnulllulllulllull}~\200\200}~\200\200nulllulllulllull^nulllulllulllullnulllulllulllullnulllulllulllull^nulllulllulllullnulllulllulllull!");
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be!", "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull!");
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!", "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!" + "'", str2, "!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!");
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214!", "U!LLU!LL!!U!LLU!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214!" + "'", str2, "OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214!");
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01c8\u01c5\u01c5\u01c5\u01c8\u01c5\u01c5\u01c5!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```!", "~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```!" + "'", str2, "~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```!");
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!!", "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!", "``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!" + "'", str2, "\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!");
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225!", "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225!" + "'", str2, "}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225}LLUULLUULLUU}LLUULLUULLUULLUULLUU}LLUULLUULLUU}LLUULLUULLUULLUULLUU\225\225!");
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!", "HHHHHHHH!!HHHHHHHH!!HHHHHHHHHHHHHHHH!!HHHHHHHH!!HHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH!" + "'", str2, "\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH!");
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "unllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!", "null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!" + "'", str2, "LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!");
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("qrttqrttqrttqrttqrtt!!!qrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrtt!!!qrttqrttqrttqrttqrttqrttqrttqrtt!", "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!");
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!", "\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!", "\u0420\u0420\u0420\u0420!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!" + "'", str2, "\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!");
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnull!", "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!luu!luu!luu!luu!luu!luu!luu!luu!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!luu!luu!luu!luu!luu!luu!luu!luu!");
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnll!", "\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!" + "'", str2, "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!");
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!!", "wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!!", "\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254!!!" + "'", str2, "\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254!!!");
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`LLUULLUULLUU`LLUULLUULLUU!", "~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe!" + "'", str2, "\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe!");
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!" + "'", str2, "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!", "UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!" + "'", str2, "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!");
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU!", "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "FHHHnullnullnullnullFHHHnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200FULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULL}~\200\200}~\200\200FULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULL!" + "'", str2, "}~\200\200}~\200\200FULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULL}~\200\200}~\200\200FULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULL!");
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\275\300\300\300\275\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!", "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!", "\u0366\u0365\u0368\u0368\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b!!!", "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!");
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u029e\u0346\u0346\ua7b0!!!", "nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346null!!!" + "'", str2, "\u0346\u0346null!!!");
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!", "\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad!!!" + "'", str2, "\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad!!!");
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!!", "\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386!!!" + "'", str2, "\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386\u0386!!!");
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c!", "NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullnull!" + "'", str2, "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullnull!");
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!", "\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\200\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!" + "'", str2, "!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!");
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254!!!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254!!!" + "'", str2, "\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254!!!");
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!", "\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275LL\275\275LL\275\275\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!" + "'", str2, "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!");
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!", "\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}!");
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108!", "\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200!" + "'", str2, "\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200!");
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```!", "\u0366\u0365\u0368\u0368\u0170\u0170\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```!" + "'", str2, "dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```!");
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!!", "HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!!" + "'", str2, "\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!!");
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!", "nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!" + "'", str2, "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!");
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336\300\300\300\300\336\300\300!", "\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!", "nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0200\u0200\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200!!!" + "'", str2, "\u0200\u0200\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200!!!");
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!", "\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u016c\u016b\u0163\u0163\u0348\u0346\u0346!");
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!LL!!LLnullnullnullnullnullnullnullnull!!LL!!LL!" + "'", str2, "nullnullnullnullnullnullnullnull!!LL!!LLnullnullnullnullnullnullnullnull!!LL!!LL!");
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~!", "\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~!");
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!", "LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!" + "'", str2, "!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!");
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!" + "'", str2, "!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!");
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215}\215\215\215}\215\215NLLLNLLLNLLLNLLL\215}\215\215\215}\215\215!", "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\215}\215\215\215}\215\215!");
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN}~\200\200}~\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "}~\200\200}~\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN}~\200\200}~\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```!", "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200null\304\304\304^null\304\304\304null\304\304\304null\304\304\304^null\304\304\304null\304\304\304}~\200\200}~\200\200null\304\304\304^null\304\304\304null\304\304\304null\304\304\304^null\304\304\304null\304\304\304!" + "'", str2, "}~\200\200}~\200\200null\304\304\304^null\304\304\304null\304\304\304null\304\304\304^null\304\304\304null\304\304\304}~\200\200}~\200\200null\304\304\304^null\304\304\304null\304\304\304null\304\304\304^null\304\304\304null\304\304\304!");
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!", "!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!" + "'", str2, "\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!");
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("XXXXXXXX!!XXXXXXXX!!XXXXXXXXXXXXXXXX!!XXXXXXXX!!XXXXXXXX!", "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "null~ssnull~ss!!null~ssnull~ss!!null~ssnull~ssnull~ssnull~ss!!null~ssnull~ss!!null~ssnull~ss!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!" + "'", str2, "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!");
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016enullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!" + "'", str2, "\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!");
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\200\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c]]!", "\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\200\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126]]!" + "'", str2, "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\200\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126]]!");
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017enullnull!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!!" + "'", str2, "nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!!");
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ!", "LLLL\276LLLLLLL\276\276LLLLL\276\276LLLLL\276\276LLLLL\276\276LLLL\276LLLLLLL\276\276LLLLL\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL!" + "'", str2, "~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL!");
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0!", "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!", "\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230\200}}`~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230]]!", "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230\200}}`~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230]]!" + "'", str2, "~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230\200}}`~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230]]!");
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!", "~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!", "HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336!" + "'", str2, "\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336!");
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!", "\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\200\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!" + "'", str2, "!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!");
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!", "nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225!" + "'", str2, "\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225!");
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!", "~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!" + "'", str2, "!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!");
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215}\215\215\215}\215\215\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\215}\215\215\215}\215\215!", "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!", "UULLUULL!!!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275H!]]H!]]H!]]\275H!]]H!]]H!]]!", "!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275L!]]L!]]L!]]\275L!]]L!]]L!]]!" + "'", str2, "\275L!]]L!]]L!]]\275L!]]L!]]L!]]!");
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271\266`U!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!", "NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220!" + "'", str2, "\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220\200unll\220\220!");
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!}~\200\200}~\200\200UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!!", "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!}~\200\200}~\200\200\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!!" + "'", str2, "}~\200\200}~\200\200\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!}~\200\200}~\200\200\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!!");
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!", "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!" + "'", str2, "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!");
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108!", "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!", "]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275```\275```\275```\275`````\275\275``\275\275``\275\275``\275\275\275```\275```\275```\275`````\275\275``\275\275!" + "'", str2, "\275```\275```\275```\275`````\275\275``\275\275``\275\275``\275\275\275```\275```\275```\275`````\275\275``\275\275!");
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!" + "'", str2, "!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!");
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!");
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275HHH\276H\275\275!", "\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLL\276L\275\275!" + "'", str2, "\275LLL\276L\275\275!");
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!", "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!" + "'", str2, "!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!");
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!", "!\253\256\256]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0!" + "'", str2, "\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0!");
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!", "nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!" + "'", str2, "NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!");
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!!!nullnull!", "}}}}}}}}}}}}}}}}\200}}`}}}}}}}}}}}}}}}}]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}}}}!!!!}}}}}}}}!" + "'", str2, "}}}}}}}}!!!!}}}}}}}}!");
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!", "\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!" + "'", str2, "]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!");
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02bd\u02bd\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\ua7b2\ua7b2!", "ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!!ijllijllijllijllijllijllijllijllnull!!!null!!!ijllijllijllijllijllijllijllijllnull!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c!!!", "t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!", "NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!");
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c!", "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!", "UUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!!" + "'", str2, "UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!UUUU\256\254\254UUUU\256\254\254!!!");
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368!" + "'", str2, "\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368\324\325\327\327!\324\325\327\327\324\325\327\327\324\325\327\327!\324\325\327\327\324\325\327\327\u0368\u0368!");
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!", "NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("IILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLL!", "\u0170\u0170\u0170\u0170nullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!" + "'", str2, "NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!");
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!", "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!!", "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!!" + "'", str2, "LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!!");
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241!" + "'", str2, "\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241!");
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "fhnullnullfhnullnullfhnullnullfhnullnull~}}^fhnullnullfhnullnullfhnullnullfhnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\256nullnullnullnullnullnullnullnullnullnullnullnull!", "\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\256\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246!" + "'", str2, "\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\256\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246!");
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!");
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300!", "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\200\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!", "\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!" + "'", str2, "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!");
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("XXXX\200}}`XXXX]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!", "f]fff]ff!!f]fff]ff!!f]fff]fff]fff]ff!!f]fff]ff!!f]fff]ff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!" + "'", str2, "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!~UU!~UU\220\220!~UU!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220!~UU!~UU\220\220!~UU!~UU\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "NLLLULNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010cnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230!", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230!" + "'", str2, "~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230!");
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200nullnullnullnullnullnullnullnull!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}L\200\200}L\200\200}L\200\200}L\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU}L\200\200}L\200\200}L\200\200}L\200\200LNUULNUULNUULNUULNUULNUULNUULNUU!" + "'", str2, "}L\200\200}L\200\200}L\200\200}L\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU}L\200\200}L\200\200}L\200\200}L\200\200LNUULNUULNUULNUULNUULNUULNUULNUU!");
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!" + "'", str2, "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~UU!~UU\220\220!~UU!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220!~UU!~UU\220\220!~UU!~UU\220\220!", "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!" + "'", str2, "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!", "!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!");
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!", "l!nnl!nnnullnulll!nnl!nnnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!", "\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dLL!" + "'", str2, "\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041d\u041dLL!");
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!", "nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!nullnullnullnullnull\230\230nullnull\230\230nullnull\230\230nullnull\230\230!nullnullnullnullnull\230\230nullnull\230\230!", "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!");
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!", "\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256````````````````\253\254\256\256````````!" + "'", str2, "\253\254\256\256````````````````\253\254\256\256````````!");
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!" + "'", str2, "\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!");
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e!", "!Lnullnull!Lnullnull!Lnullnull!Lnullnull!Lnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UUUUUUUU!", "\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!", "U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230!", "~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230!");
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]FF]]FF!!]]FF]]FF!!]]FF]]FF]]FF]]FF!!]]FF]]FF!!]]FF]]FF!", "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]UU]]UU!!]]UU]]UU!!]]UU]]UU]]UU]]UU!!]]UU]]UU!!]]UU]]UU!" + "'", str2, "]]UU]]UU!!]]UU]]UU!!]]UU]]UU]]UU]]UU!!]]UU]]UU!!]]UU]]UU!");
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!" + "'", str2, "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!");
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn\220\220\216\216\220\220\216\216ppnnppnn!", "!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!" + "'", str2, "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("W!XXW!XXW!XXW!XX\200}}`W!XXW!XXW!XXW!XX]]!", "\u0366\u0365\u0368\u0368\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnull\200}}`null!nullnullnull!nullnullnull!nullnullnull!nullnull]]!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnull\200}}`null!nullnullnull!nullnullnull!nullnullnull!nullnull]]!");
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!" + "'", str2, "\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!");
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!", "}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!", "unllNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!", "\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!" + "'", str2, "\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!");
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266!", "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266!" + "'", str2, "\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266\256\256\256\256\256\256\256\256\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!!", "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!" + "'", str2, "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UL!!UL!!!", "nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NL!!NL!!!" + "'", str2, "NL!!NL!!!");
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UULLUULL!!UULLUULL!!UULLUULLUULLUULL!!UULLUULL!!UULLUULL!", "\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275!" + "'", str2, "UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275UN\275\275\200UN\275\275UN\275\275!");
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!" + "'", str2, "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!");
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!", "]]HH]]HH!!]]HH]]HH!!]]HH]]HH]]HH]]HH!!]]HH]]HH!!]]HH]]HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!");
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!", "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!!!!!!" + "'", str2, "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!!!!!!");
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!", "!\253\256\256]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!" + "'", str2, "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!");
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\230!", "dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\230!" + "'", str2, "!\230!");
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\225!", "N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\225!" + "'", str2, "!\225!");
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!", "!ULL!ULL!ULL!ULL!ULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!" + "'", str2, "!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!");
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!", "\u0366\u0365\u0368\u0368\u03c0\u03c0\u03c0\u03c0!!\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220nullnull!" + "'", str2, "\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220\u03a0\220nullnull\200\u03a0\220nullnull\200\u03a0\220\u03a0\220nullnull!");
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275UNLLUNLLUNLL\276UNLL\275\275!", "\367!nullnull\367!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!U!!!U!!!U!!\276!U!!\275\275!" + "'", str2, "\275!U!!!U!!!U!!\276!U!!\275\275!");
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0126\u0128\u0128\u0126\u0128\u0128!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e!!!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e!!!");
    }
}
