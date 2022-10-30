package SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBB!", "LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLL!" + "'", str2, "AALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLLAALLAALLLL!");
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLL!", "!\253\256\256]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d6\u02d5\u02d8\u02d8\u02d6\u02d5\u02d8\u02d8!" + "'", str2, "\u02d6\u02d5\u02d8\u02d8\u02d6\u02d5\u02d8\u02d8!");
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null]!]]]!]]]!]]null]!]]]!]]]!]]!", "\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull]!]]]!]]]!]]nullnullnullnull]!]]]!]]]!]]!" + "'", str2, "nullnullnullnull]!]]]!]]]!]]nullnullnullnull]!]]]!]]]!]]!");
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````!", "!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````!" + "'", str2, "\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````!");
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!!", "\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!!" + "'", str2, "]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254]L]]]L]]]L]]]L]]]L]]]L]]!!]L]]]L]]!!]L]]]L]]!!\256\254\254!!!");
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!!", "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!!" + "'", str2, "\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!\270nullnullnullnullnullnullnullnullnullnull\270\270\270nullnullnullnullnullnullnullnullnullnull\270\270!!!");
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "]!````````````````!!!````````````````!!!````````````````!!!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]]!````````````````!!!````````````````!!!````````````````!!!````````````````!!!````````````````!!]]!````````````````!!!````````````````!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!", "ULLLULLL!!ULLLULLL!!ULLLULLLULLLULLL!!ULLLULLL!!ULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!" + "'", str2, "\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!");
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!", "!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!" + "'", str2, "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!");
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276!", "\u0289\u028a\u028c\u028c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276!" + "'", str2, "\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276!");
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!", "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\200}}`\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214]]!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\200}}`\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214]]!");
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!\200}}`!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031enullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031enullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031enullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031enullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "nullCCCnullCCCnullCCCnullCCC\200}}`nullCCCnullCCCnullCCCnullCCC]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214!", "l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214!" + "'", str2, "UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214UL!!UL!!null!\214\214null!\214\214!");
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!!nullnull\300\300~nullnull\300\300nullnull\300\300nullnull\300\300~nullnull\300\300nullnull\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da!!!\253\254\256\256\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da!!!!" + "'", str2, "\253\254\256\256\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da!!!\253\254\256\256\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da!!!!");
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!", "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225!" + "'", str2, "UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225UNLLUNLLNNUNLLUNLLNN\225\225!");
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!", "}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!!!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!!!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!!!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!!!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!" + "'", str2, "!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!!!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!!!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!!!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!!!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!");
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!", "!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!!!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!!!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!!!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!!!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!" + "'", str2, "!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!!!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!!!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!!!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!!!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!");
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`null]nullnullnull]nullnullnull]nullnull`null]nullnullnull]nullnullnull]nullnull!", "!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull`nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull`nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!", "~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR~}\200\200~}\200\200L!LLL!LLURRRURRRL!LLL!LLURRRURRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!");
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!", "LJ!!LJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!" + "'", str2, "``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!");
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLIIILIIILIII!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200}}}!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200}}}!");
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294!!!" + "'", str2, "\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294\u0294!!!");
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!" + "'", str2, "\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!");
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!" + "'", str2, "UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!");
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!", "L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!" + "'", str2, "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "`!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u036e\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!");
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d!", "\u0366\u0365\u0368\u0368\336\336!!\336\336!!!!\336\336!!\336\336!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!" + "'", str2, "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!");
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\200\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!", "NULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!" + "'", str2, "\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!");
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnull!!nullnullnullnullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!" + "'", str2, "nullnullnull!!nullnullnullnullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!");
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\300\276\276\275\300\276\276!", "]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275null\276\276\275null\276\276!" + "'", str2, "\275null\276\276\275null\276\276!");
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "IILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLLIILLIILLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!\200\200\u0346\u0348\u0348!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!", "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\275\276null\225\225\276null\225\225\200\200\276null\225\225\276null\225\225\200\200\276null\225\225\276null\225\225\200\200\276\276null\225\225\276null\225\225\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!!NLLLNLLL!!NLLLNLLL!", "\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvv!", "\275\335\336\340\340\335\336\340\340\335\336\340\340\276\335\336\340\340\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!!!L!!!!", "\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145!!!!!\200\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145!!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!!" + "'", str2, "null!!!null!!!!");
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!!", "\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!!" + "'", str2, "ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!!");
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!");
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238!", "\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!!!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!!!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!!!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!!!" + "'", str2, "!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!!!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!~\351!\351\351\351!\351\351!!!");
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!", "bnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!" + "'", str2, "\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!");
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFFFFFFFFFFFFFFF\200}}`FFFFFFFFFFFFFFFF]]!", "\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012anullnull!!!", "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!" + "'", str2, "!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!nullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUUnullnullLNUULNUU!!!");
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]!", "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullll]]!" + "'", str2, "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullll]]!");
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!\331\330\333\333\331\330\333\333\331\330\333\333\331\330\333\333!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "VV!!VV!!!!``VV!!VV!!``VV!!VV!!``VV!!VV!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!``VV!!VV!!``VV!!VV!!``VV!!VV!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~!", "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~!!!\200\200}~!!!\200\200}~!!!\200\200}~!!!\200\200~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~}~!!!\200\200}~!!!\200\200}~!!!\200\200}~!!!\200\200~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~!" + "'", str2, "}~!!!\200\200}~!!!\200\200}~!!!\200\200}~!!!\200\200~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~}~!!!\200\200}~!!!\200\200}~!!!\200\200}~!!!\200\200~!~~~!~~~!~~~!~~~!~~~!~~~!~~~!~~!");
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!", "\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\215}\215\215\215}\215\215!");
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU]]UU]]UU]]UU]]~}}^UU]]UU]]UU]]UU]]]]!", "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200]]\200\200]]\200\200]]\200\200]]~}}^\200\200]]\200\200]]\200\200]]\200\200]]]]!" + "'", str2, "\200\200]]\200\200]]\200\200]]\200\200]]~}}^\200\200]]\200\200]]\200\200]]\200\200]]]]!");
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368ULLLULLL!!ULLLULLL!!\200\200\u0346\u0348\u0348!", "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "\u0366\u0365\u0368\u0368L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!", "ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!!\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!!\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!!\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!!\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!" + "'", str2, "\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!!\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!!\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!!\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!!\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!");
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!", "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!", "LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!");
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!", "!\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!" + "'", str2, "nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!");
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!", "\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!" + "'", str2, "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!");
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!!!", "!~LL!~LL\220\220!~LL!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220!~LL!~LL\220\220!~LL!~LL\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!!!" + "'", str2, "!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!!!");
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!", "LLLLLLLL!!LLLLLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!" + "'", str2, "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!");
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!", "`}UU`}UU`}UU`}UU`}UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!" + "'", str2, "uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!");
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!", "\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227!" + "'", str2, "\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227!");
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee!", "nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull!" + "'", str2, "!\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull!");
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230!", "EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230!" + "'", str2, "~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230!");
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!!" + "'", str2, "U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!U`UUU`UU!!!");
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\254\275\254\254\254\275\254\254!!\254\275\254\254\254\275\254\254!!!", "\u0366\u0365\u0368\u0368!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\275\254\254\254\275\254\254!!\254\275\254\254\254\275\254\254!!!" + "'", str2, "\254\275\254\254\254\275\254\254!!\254\275\254\254\254\275\254\254!!!");
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU!" + "'", str2, "~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU~}\200\200~}\200\200\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016eUU!");
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!!", "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!!" + "'", str2, "\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!!");
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "\u0366\u0365\u0368\u0368\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011anullnull!!!!!!!" + "'", str2, "\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011anullnull!!!!!!!");
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!", "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLL!", "\336\300\300\300\300\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnull!" + "'", str2, "nullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnull!");
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!", "\u0366\u0365\u0368\u0368AA!!AA!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!" + "'", str2, "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!");
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\367!nullnull\367!nullnull!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\367!UNLLUNLL\367!UNLLUNLL!" + "'", str2, "\367!UNLLUNLL\367!UNLLUNLL!");
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204!", "!\253\256\256\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204!");
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU!" + "'", str2, "``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU``LNUULUULNUULUU!");
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!", "}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220!" + "'", str2, "\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220\220\220!!\220\220!!null\220\220\220null\220\220\220!");
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366!!!", "null]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366!!!" + "'", str2, "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366!!!");
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLL!", "ELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "E!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLL!" + "'", str2, "E!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLL!");
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!" + "'", str2, "!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!");
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnull!" + "'", str2, "null\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnullnull\274nullnull!");
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!", "LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\215}\215\215\215}\215\215!", "\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!", "!\253\256\256\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!" + "'", str2, "}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!");
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\u01e0\u01e0\u01e0!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!!", "!LLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230nullnullnull!\230nullnullnull\230nullnullnull\230nullnullnull\230nullnullnull!!\230nullnullnull\230nullnullnull!!\230nullnullnull\230nullnullnull!!\230nullnullnull\230nullnullnull!!\230nullnullnull!\230nullnullnull\230nullnullnull\230nullnullnull\230nullnullnull!!\230nullnullnull\230nullnullnull!!!" + "'", str2, "\230nullnullnull!\230nullnullnull\230nullnullnull\230nullnullnull\230nullnullnull!!\230nullnullnull\230nullnullnull!!\230nullnullnull\230nullnullnull!!\230nullnullnull\230nullnullnull!!\230nullnullnull!\230nullnullnull\230nullnullnull\230nullnullnull\230nullnullnull!!\230nullnullnull\230nullnullnull!!!");
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e!!!!!", "hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!", "xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!");
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214!", "UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214!" + "'", str2, "nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214!");
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~]]!~]]!!!~]]!~]]!!!~]]!~]]!~]]!~]]!!!~]]!~]]!!!~]]!~]]!", "}~\200\200}~\200\200\u02b1\u02b2\u02b4\u02b4\u02b1\u02b2\u02b4\u02b4}~\200\200}~\200\200\u02b1\u02b2\u02b4\u02b4\u02b1\u02b2\u02b4\u02b4!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~]]!~]]!!!~]]!~]]!!!~]]!~]]!~]]!~]]!!!~]]!~]]!!!~]]!~]]!" + "'", str2, "!~]]!~]]!!!~]]!~]]!!!~]]!~]]!~]]!~]]!!!~]]!~]]!!!~]]!~]]!");
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!", "\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!", "\275nullnullnull\276null\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!" + "'", str2, "!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!");
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275\275\275\275\275\275\275!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!" + "'", str2, "!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!");
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0256\u0256!!!", "ppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnn!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PNNNnull!!PNNNnull!!!" + "'", str2, "PNNNnull!!PNNNnull!!!");
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\200}}`!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276]]!", "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\200}}`!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276]]!" + "'", str2, "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\200}}`!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276]]!");
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!", "~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````~}\200\200~}\200\200````````````````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````!");
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!", "!U!!!U!!!U!!!U!!U!U!!!!U!U!!!!U!U!!!!U!U!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull}~\200\200}~\200\200null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull!" + "'", str2, "}~\200\200}~\200\200null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull}~\200\200}~\200\200null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull^null\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnullnull\210nullnull!");
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLL\276LLLLLLL\276\276LLLLL\276\276LLLLL\276\276LLLLL\276\276LLLL\276LLLLLLL\276\276LLLLL\276\276!", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRR\276RRRRRRR\276\276RRRRR\276\276RRRRR\276\276RRRRR\276\276RRRR\276RRRRRRR\276\276RRRRR\276\276!" + "'", str2, "RRRR\276RRRRRRR\276\276RRRRR\276\276RRRRR\276\276RRRRR\276\276RRRR\276RRRRRRR\276\276RRRRR\276\276!");
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!", "\u0225\u0228\u0228\u0228\200\u0225\u0228\u0228\u0228]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!", "nullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!" + "'", str2, "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!");
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUU\200}}`LUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUU]]!", "\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\200\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a]]!" + "'", str2, "\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\200\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a]]!");
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215NLLLNLLLNLLLNLLL\215}\215\215\215}\215\215!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!", "\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!" + "'", str2, "~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!");
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!", "}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!" + "'", str2, "UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!");
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\276\300\300\300null\276\276\300null\276\276\300null\276\276\300null\276\276null\276\300\300\300null\276\276\300null\276\276!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276!" + "'", str2, "nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276!");
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a!!!", "!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\200\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220]]!", "\275H!]]H!]]H!]]\275H!]]H!]]H!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!", "\u0366\u0365\u0368\u0368\u0220\u021d\u021d\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!");
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!", "\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull!" + "'", str2, "\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````!", "!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!!!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!!!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!!!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!!!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!~~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200~L\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````!" + "'", str2, "\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````!");
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!", "````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````!!````````````````````````````````````````````````````````````````````````````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!" + "'", str2, "!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!");
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!", "LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!" + "'", str2, "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!");
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!", "\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275nullnullsvvnullsvvnullsvvnullnullsvvnullsvvnullsvv\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!" + "'", str2, "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!");
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!!" + "'", str2, "!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!!");
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\200\u01d0\u01d0\200\200\u01d0\u01d0!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200nullnull\200\200nullnull!" + "'", str2, "\200\200nullnull\200\200nullnull!");
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227!" + "'", str2, "\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227\276\276\u0198\u0198\u0198\u0198nullnull\276\227\227\u0198\u0198\u0198\u0198nullnull\276\227\227!");
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200UUUU^UUUUUUUUUUUU^UUUUUUUU}~\200\200}~\200\200UUUU^UUUUUUUUUUUU^UUUUUUUU!" + "'", str2, "}~\200\200}~\200\200UUUU^UUUUUUUUUUUU^UUUUUUUU}~\200\200}~\200\200UUUU^UUUUUUUUUUUU^UUUUUUUU!");
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!" + "'", str2, "!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!");
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLUU!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!\300\300!" + "'", str2, "!!!\300\300!");
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!", "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!!NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!!NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!!NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!!NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!" + "'", str2, "NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!!NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!!NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!!NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!!NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!");
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!!" + "'", str2, "TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!!");
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```!", "````````````````````````````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!");
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLLULLLULLL}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\254!!\254\254!!!", "\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254!!\254\254!!!" + "'", str2, "\254\254!!\254\254!!!");
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!!JILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILLJILL\220JILLJILL\200~~JILL\220JILLJILL\200~~JILL\220JILLJILLJILL\220JILLJILL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!!" + "'", str2, "JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!JLLL!!!!");
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!" + "'", str2, "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!");
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!" + "'", str2, "EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!");
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!", "N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!");
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!", "ELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL!!]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL!!]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL!!]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL!!]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL!" + "'", str2, "]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL!!]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL!!]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL!!]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL!!]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL]]LLLLLLLL!");
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U\200\200\200\200]UU\200]UU\200]UU\200]UUU\200\200\200\200]UU\200]UU!", "\200\200\u01d0\u01d0\200\200\u01d0\u01d0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\200\200\200\200]nullnull\200]nullnull\200]nullnull\200]nullnullnull\200\200\200\200]nullnull\200]nullnull!" + "'", str2, "null\200\200\200\200]nullnull\200]nullnull\200]nullnull\200]nullnullnull\200\200\200\200]nullnull\200]nullnull!");
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!", "\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!" + "'", str2, "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L\204LLL\204LLL\204LLL\204LLLLLLLLLLLLLLLLLLL\204LLL\204LLL\204LLL\204LLLLLLLLLL!", "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\204]]]\204]]]\204]]]\204]]]]]]]]]]]]]]]]]]]\204]]]\204]]]\204]]]\204]]]]]]]]]]!" + "'", str2, "]\204]]]\204]]]\204]]]\204]]]]]]]]]]]]]]]]]]]\204]]]\204]]]\204]]]\204]]]]]]]]]]!");
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!", "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnullnullnullnullnullnull!", "!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "nullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!!!", "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!!!" + "'", str2, "!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!!!");
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100!", "\246\250\250\250\246\250\250\250!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u040b\u040c\u040e\u040e\u040b\u040c\u040e\u040e\u040b\u040c\u040e\u040e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u040b\u040c\u040e\u040e\u040b\u040c\u040e\u040e\u040b\u040c\u040e\u040e\u0348\u0346\u0346!");
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275L!]]L!]]L!]]\275L!]]L!]]L!]]!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275L!]]L!]]L!]]\275L!]]L!]]L!]]!" + "'", str2, "\275L!]]L!]]L!]]\275L!]]L!]]L!]]!");
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!", "!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!!!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!~n!nnn!nn!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!");
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e!", "!!\214\214\214\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LLLL!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368NNLLNNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0228\u0228\u0228\u0228!" + "'", str2, "\u0228\u0228\u0228\u0228!");
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("H!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HH!", "lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UU!" + "'", str2, "U!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UU!");
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!", "UNLLUNLL!!``UNLLUNLL``UNLLUNLL``UNLLUNLLUNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!``UNLLUNLL``UNLLUNLL``UNLLUNLLUNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!" + "'", str2, "!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!");
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!", "\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!" + "'", str2, "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLL!!!!UNLLUNLL!", "`}UU`}UU`}UU`}UU`}UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TnullnullnullTnullnullnull!!!!TnullnullnullTnullnullnull!" + "'", str2, "TnullnullnullTnullnullnull!!!!TnullnullnullTnullnullnull!");
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("rrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPP!", "\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!", "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!" + "'", str2, "!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!!!`\253\253!`\253\253!!!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!`\253\253!");
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!" + "'", str2, "!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!");
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLL!", "\u0104\u0104!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLL!" + "'", str2, "nullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLL!");
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!", "!\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!" + "'", str2, "\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!");
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u0346\u0348\u0348!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0348\u0348!");
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!", "\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!", "}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!" + "'", str2, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!" + "'", str2, "!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!");
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!!", "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!!" + "'", str2, "\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!\307\307\307\307\307\307\307\307\307\307\307\307!!!!!!!");
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU`LNUULNUULNUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!", "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!" + "'", str2, "null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!");
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\255nullnull!\255nullnull!\255nullnull!\255nullnull!\255nullnull!" + "'", str2, "!\255nullnull!\255nullnull!\255nullnull!\255nullnull!\255nullnull!");
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUULUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]NNN]NNN]NNN]NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN]NNN]NNN]NNN]NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "]NNN]NNN]NNN]NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN]NNN]NNN]NNN]NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!", "\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!" + "'", str2, "!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!!!```!```!```!```!```!```!```!```!");
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200!!~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200!!~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200!!~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200!!~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200!" + "'", str2, "~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200!!~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200!!~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200!!~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200!!~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200~UUU~UUU~UUU~UUU~UUU~UUU~UUU~UUU\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225!", "\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a\u0318\u031a\u031a\u031a!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225!" + "'", str2, "\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225!");
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!", "~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200!!!!!!!!!" + "'", str2, "\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200\u02a0\200\200!!!!!!!!!");
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253!", "null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276!!\253\253!");
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!]]]!]]]!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]]]!" + "'", str2, "!]]]!]]]!");
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!", "efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu!" + "'", str2, "~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu!");
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!", "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!" + "'", str2, "!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!");
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276!", "NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276!" + "'", str2, "N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276N\276\276\276N\276\276\276\276\276!");
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!" + "'", str2, "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!");
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!", "\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull!" + "'", str2, "\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull\253\254\256\256\253\254\256\256nullnull!");
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!", "~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!" + "'", str2, "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!", "``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!" + "'", str2, "!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!!!```!```!!!```!```!!!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!");
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!", "]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!" + "'", str2, "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!");
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!", "]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220!" + "'", str2, "\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220!");
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!");
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~!", "\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}L!!!\200\200}L!!!\200\200}L!!!\200\200}L!!!\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}L!!!\200\200}L!!!\200\200}L!!!\200\200}L!!!\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!" + "'", str2, "}L!!!\200\200}L!!!\200\200}L!!!\200\200}L!!!\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}L!!!\200\200}L!!!\200\200}L!!!\200\200}L!!!\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!");
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnull!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!", "nullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullnullLLLLnullnullnullLLLLnullnullnullLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!" + "'", str2, "!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!");
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\340\336\225\225\340\336\225\225\340\336\225\225\340\336\225\225\340\336\225\225\340\336\225\225\340\336\225\225\340\336\225\225!" + "'", str2, "\340\336\225\225\340\336\225\225\340\336\225\225\340\336\225\225\340\336\225\225\340\336\225\225\340\336\225\225\340\336\225\225!");
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254!!!", "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!!" + "'", str2, "nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!!");
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnull!", "\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02benullnull~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276!" + "'", str2, "\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276\u0273\u0274\u0276\u0276!");
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!!", "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!!" + "'", str2, "``!!``!!!");
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EEEEEEEEEEEEEEEE\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!", "NL!!NL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!" + "'", str2, "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N!!!N!!!!", "\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275UU\275\275UU\275\275\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!!!U!!!!" + "'", str2, "U!!!U!!!!");
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNN!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!", "\u0366\u0365\u0368\u0368\300\335\335\335\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!" + "'", str2, "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!!!!!!!!}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!", "\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!!!!!!!!}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!" + "'", str2, "}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!!!!!!!!}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!");
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullF!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216!" + "'", str2, "\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216!");
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!!", "UNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!!");
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!!" + "'", str2, "\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!\342\344\344\344\342\344\344\256\254\254\342\344\344\344\342\344\344\256\254\254!!!");
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!", "`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\u0346\u0348\u0348!", "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!");
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!", "LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!" + "'", str2, "!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!");
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufllh~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!", "!U!!!U!!!U!!!U!!U!U!!!!U!U!!!!U!U!!!!U!U!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U~!U!!!U!!U~!U!!!U!!!!U~!U!!!U!!U~!U!!!U!!!!U~!U!!!U!!U~!U!!!U!!U~!U!!!U!!U~!U!!!U!!!!U~!U!!!U!!U~!U!!!U!!!!U~!U!!!U!!U~!U!!!U!!!" + "'", str2, "U~!U!!!U!!U~!U!!!U!!!!U~!U!!!U!!U~!U!!!U!!!!U~!U!!!U!!U~!U!!!U!!U~!U!!!U!!U~!U!!!U!!!!U~!U!!!U!!U~!U!!!U!!!!U~!U!!!U!!U~!U!!!U!!!");
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256!", "NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!\276!!!\276!!!\276!!!\200}}`\276!!!\276!!!\276!!!\276!!!]]!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!\276!!!\276!!!\200}}`\276!!!\276!!!\276!!!\276!!!]]!" + "'", str2, "\276!!!\276!!!\276!!!\276!!!\200}}`\276!!!\276!!!\276!!!\276!!!]]!");
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!", "\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!" + "'", str2, "!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!");
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!", "U~LLU~LL!!U~LLU~LL!!U~LLU~LLU~LLU~LL!!U~LLU~LL!!U~LLU~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!", "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnullnullnull!!!", "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368LLUULLUULLUULLUU!!!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368LLUULLUULLUULLUU!!!");
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!", "\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!" + "'", str2, "!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!");
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354!", "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!!", "\275``uuuuuuuu``uuuuuuuu``uuuuuuuu\276``uuuuuuuu\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!!" + "'", str2, "\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!\212\212\212\212jjjjjjjjjjjj\256\254\254\212\212\212\212jjjjjjjjjjjj\256\254\254!!!");
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN`!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!", "\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215`!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!" + "'", str2, "`!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215`!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!\215\215\215!");
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!!!", "\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275^^^\275^^^\275^^^\275^^^^^\275\275^^\275\275^^\275\275^^\275\275\275^^^\275^^^\275^^^\275^^^^^\275\275^^\275\275!", "\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275^^^\275^^^\275^^^\275^^^^^\275\275^^\275\275^^\275\275^^\275\275\275^^^\275^^^\275^^^\275^^^^^\275\275^^\275\275!" + "'", str2, "\275^^^\275^^^\275^^^\275^^^^^\275\275^^\275\275^^\275\275^^\275\275\275^^^\275^^^\275^^^\275^^^^^\275\275^^\275\275!");
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0289\u028a\u028c\u028c!", "~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!\200}}`!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!]]!", "!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179!!\200\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179!!]]!" + "'", str2, "\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179!!\200\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179\u0179!!]]!");
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!", "\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!", "LNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!" + "'", str2, "LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!");
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "}!\200\200}!\200\200}!\200\200}!\200\200\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215\230null\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]nullnullnull\200}}`]nullnullnull]]!", "\u0366\u0365\u0368\u0368\u0220\u021d\u021d\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnull!!nullnull!!nullnull!!\200}}`]nullnull!!nullnull!!nullnull!!]]!" + "'", str2, "]nullnull!!nullnull!!nullnull!!\200}}`]nullnull!!nullnull!!nullnull!!]]!");
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\253\253\253\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\253\253\253]]!", "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U]^^nullnullnullU]^^nullnullnullU]^^nullnullnullU]^^nullnullnull\253\253\253\200}}`U]^^nullnullnullU]^^nullnullnullU]^^nullnullnullU]^^nullnullnull\253\253\253]]!" + "'", str2, "U]^^nullnullnullU]^^nullnullnullU]^^nullnullnullU]^^nullnullnull\253\253\253\200}}`U]^^nullnullnullU]^^nullnullnullU]^^nullnullnullU]^^nullnullnull\253\253\253]]!");
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\340\335\335\336\340\335\335!" + "'", str2, "\336\340\335\335\336\340\335\335!");
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull!", "lluulluu!!lluulluu!!lluulluulluulluu!!lluulluu!!lluulluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL!" + "'", str2, "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL!");
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0223\200\200\u0223\200\200\u0223\200\200\u0223\200\200\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226\u0223\200\200\u0223\200\200\u0223\200\200\u0223\200\200\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226!", "\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!", "unllNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!" + "'", str2, "F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!");
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\236\276\276!");
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("H!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HH!", "nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LL!" + "'", str2, "L!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LL!");
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!H!", "!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!\200}}`!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!!NLLL!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!l!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!" + "'", str2, "!L!");
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!", "NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!" + "'", str2, "!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!");
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("x~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnullx~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnull!", "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!", "\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\200\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6\u01f6]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!" + "'", str2, "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!");
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!", "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!" + "'", str2, "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230\200}}`~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230]]!", "nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230\200}}`~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230]]!" + "'", str2, "~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230\200}}`~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230~LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU~~\225\230\230]]!");
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!", "\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull!" + "'", str2, "`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull!");
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f!", "\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaa!", "}~\200\200}~\200\200NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU}~\200\200}~\200\200NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016enullnull!" + "'", str2, "\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016e\u016d\u0170\u016e\u016enullnull!");
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!!", "\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011anullnullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!!" + "'", str2, "^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!!");
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!" + "'", str2, "!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!NN!!!NN!!NN!!NN!!!NN!!NN!!NN!!NN!!!");
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276LLL\276LLL\276LLL\276LLL\276LLL!", "LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!\276!!!\276!!!\276!!!!" + "'", str2, "\276!!!\276!!!\276!!!\276!!!\276!!!!");
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```!", "\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```!" + "'", str2, "LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```!");
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!!", "PNNNnull!!PNNNnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "oprroprr!!oprroprr!!!" + "'", str2, "oprroprr!!oprroprr!!!");
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!", "null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!!null\220OO\200~~null\220OO\200~~null\220OOnull\220OOnull\220OO\200~~null\220OO\200~~null\220OOnull\220OO!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~U~~~U~~~\275\275U~~~U~~~\275\275U~~~U~~~\275\275U~~~U~~~\275\275\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~U~~~U~~~\275\275U~~~U~~~\275\275!" + "'", str2, "\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~U~~~U~~~\275\275U~~~U~~~\275\275U~~~U~~~\275\275U~~~U~~~\275\275\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~U~~~U~~~\275\275U~~~U~~~\275\275!");
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256!nullnullnull!nullnullnull!nullnullnull!nullnullnull\253\254\256\256!nullnullnull!nullnullnull!", "OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!RRRRRRRRRRRR!RRRRRRRRRRRR!RRRRRRRRRRRR!RRRRRRRRRRRR\253\254\256\256!RRRRRRRRRRRR!RRRRRRRRRRRR!" + "'", str2, "\253\254\256\256!RRRRRRRRRRRR!RRRRRRRRRRRR!RRRRRRRRRRRR!RRRRRRRRRRRR\253\254\256\256!RRRRRRRRRRRR!RRRRRRRRRRRR!");
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!" + "'", str2, "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260!", "XXUUXXUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260!" + "'", str2, "nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!", "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\200\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272nullnull!" + "'", str2, "\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272nullnull!");
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!", "\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!" + "'", str2, "\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!");
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0276\u0276\u0276\u0276\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0276\u0276\u0276\u0276\u0346\u0348\u0348!");
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380!", "\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!" + "'", str2, "\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!");
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!", "\250!!!\250!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNN!", "null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurr!" + "'", str2, "r!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurr!");
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!!", "!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!!" + "'", str2, "\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!!");
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("PNNNnull!!PNNNnull!!!", "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03e6\u03e6\u03e6\u0406\u0407\u0409\u0409\u03e6\u03e6\u03e6\u0406\u0407\u0409\u0409!!!" + "'", str2, "\u03e6\u03e6\u03e6\u0406\u0407\u0409\u0409\u03e6\u03e6\u03e6\u0406\u0407\u0409\u0409!!!");
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\226UUU\226UU!!U\226UUU\226UU!!U\226UUU\226UUU\226UUU\226UU!!U\226UUU\226UU!!U\226UUU\226UU!", "~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230\200}}`~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\226LLL\226LL!!L\226LLL\226LL!!L\226LLL\226LLL\226LLL\226LL!!L\226LLL\226LL!!L\226LLL\226LL!" + "'", str2, "L\226LLL\226LL!!L\226LLL\226LL!!L\226LLL\226LLL\226LLL\226LL!!L\226LLL\226LL!!L\226LLL\226LL!");
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c!", "\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200!", "\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200!" + "'", str2, "`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200!");
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!", "RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!" + "'", str2, "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("````````````````\200}}`````````````````]]!", "ppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````\200}}`````````````````]]!" + "'", str2, "````````````````\200}}`````````````````]]!");
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!", "!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN\200}}`!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!" + "'", str2, "!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!");
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH\200}}`EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH]]!", "nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL\200}}`NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL]]!" + "'", str2, "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL\200}}`NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL]]!");
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7```!", "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302!", "\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302!" + "'", str2, "\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302!");
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!", "!!nullnullnull!!!!nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!" + "'", str2, "}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!");
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0200\u0200\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200!!!", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nn!!uunnuunnuunnnn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!uunnuunnuunnnn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!!" + "'", str2, "nn!!uunnuunnuunnnn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!uunnuunnuunnnn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!!");
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!" + "'", str2, "!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!");
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!" + "'", str2, "\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!");
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215\u014e\u014e\u014e\u014e!!!\215}\215\215\215}\215\215!", "~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL~}\200\200~}\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215L!!!L!!!L!!!L!!!\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215L!!!L!!!L!!!L!!!\215}\215\215\215}\215\215!");
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!", "~\200}}~\200}}~\200}}~\200}}UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~\200}}~\200}}~\200}}~\200}}UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!" + "'", str2, "!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!");
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220\200\u011b\u011c\u011e\u011e\220\220!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220!" + "'", str2, "\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220!");
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!", "]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\260NN\260\260NN}}\260\260NN\260\260NN}}!", "\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!" + "'", str2, "\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!");
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU!", "PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!", "FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!" + "'", str2, "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!");
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\356\355\360\360\356\355\360\360\356\355\360\360\356\355\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\355\360\360\356\355\360\360\356\355\360\360\356\355\360\360\356\360\360\360\356\360\360\360!", "fehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!", "}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!" + "'", str2, "]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!");
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad!" + "'", str2, "\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad!");
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!", "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]~}}^nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!" + "'", str2, "!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!~!!~!!!~!!!~!!!!~!!!~!!!~!!!");
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\200\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e]]!", "\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220!~~\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216\220W\216\216!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216WW\200\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216WW]]!" + "'", str2, "\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216WW\200\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216\u0348\u0348~~W\220\216\216\216WWW\220\216\216\216WWW\220\216\216\216WW]]!");
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120\u0120!", "OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!!RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!!RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!!RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!!RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!" + "'", str2, "RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!!RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!!RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!!RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!!RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!");
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230!\225\225\230!\225\225!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!", "nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!" + "'", str2, "\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!");
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUU!", "\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300!" + "'", str2, "\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\300\300\300\300\335\300\300\300\335\300\300\300\335\300\300!");
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!", "\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!" + "'", str2, "nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214!", "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214!" + "'", str2, "\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!!\214\214!");
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("II!!II!!II!!II!!II!!II!!II!!II!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaa!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!");
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UUUUUUUU\253\253UUUUUUUU\253\253UUUUUUUU\253\253UUUUUUUU\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UUUUUUUU\253\253UUUUUUUU\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UUUUUUUU\253\253UUUUUUUU\253\253UUUUUUUU\253\253UUUUUUUU\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UUUUUUUU\253\253UUUUUUUU\253\253!");
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!", "\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!" + "'", str2, "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175\u0198\u0198\u0195\u0195\u0198\u0198\u0195\u0195\u0178\u0178\u0175\u0175\u0178\u0178\u0175\u0175!", "\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!!", "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!!" + "'", str2, "~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!!");
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256!", "!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256!" + "'", str2, "\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256!");
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!", "nullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e!" + "'", str2, "\u014e\u014e!");
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318!", "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318!" + "'", str2, "\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318!");
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!" + "'", str2, "``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!");
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!" + "'", str2, "!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!!\256LNLL\254\254\256LNLL\254\254!");
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340!!!", "nullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!!" + "'", str2, "LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!!");
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271\266UU!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!", "\u0128\u0126\u0126\u0108\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!!" + "'", str2, "JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!JJJJJJJJ!!!");
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!", "\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!" + "'", str2, "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346!", "\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUUNLUUNLUU\275\275NLUUNLUU\275\275NLUUNLUU\275\275NLUUNLUU\275\275\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUUNLUUNLUU\275\275NLUUNLUU\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!", "`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!");
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXX!!XXXXXXXX!!XXXXXXXXXXXXXXXX!!XXXXXXXX!!XXXXXXXX!", "\215}\215\215\215}\215\215L\270\270\270L\270\270\270L\270\270\270L\270\270\270\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv!", "}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379!!!!!!!" + "'", str2, "\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379!!!!!!!");
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "UL!!UL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleff!" + "'", str2, "!!!nulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleff!");
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!\270\270NN!!NN!!!", "\275UUU\275UUU\275UUU\275UUU\275UUU\275UUU\275UUU\275UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!" + "'", str2, "\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!\270\270UU!!UU!!!");
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!", "UU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HH!", "\u0346\u0348\u0348\u0348\342\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LL!" + "'", str2, "LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LL!");
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!", "!l!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!");
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!", "}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!", "\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!" + "'", str2, "````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!!````\220````````\200~~````\220````````\200~~````\220````````````\220````````````\220````````\200~~````\220````````\200~~````\220````````````\220````````!");
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!" + "'", str2, "LL!!LL!!!");
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275!U!!!U!!!U!!\276!U!!\275\275!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!~!!!~!!!~!!\276!~!!\275\275!" + "'", str2, "\275!~!!!~!!!~!!\276!~!!\275\275!");
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!!", "!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!" + "'", str2, "LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!");
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!" + "'", str2, "\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!");
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU\200}}`LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU]]!", "LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuu\200}}`vvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuu]]!" + "'", str2, "vvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuu\200}}`vvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuu]]!");
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnull!", "}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u0317\u031a\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u0317\u031a\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u0317\u031a\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u0317\u031a\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!" + "'", str2, "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u0317\u031a\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u0317\u031a\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u0317\u031a\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u0317\u031a\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!");
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!e!", "RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL!" + "'", str2, "\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL\276LLL!");
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!", "\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e}~\200\200}~\200\200\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e!" + "'", str2, "}~\200\200}~\200\200\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e}~\200\200}~\200\200\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e!");
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!U!!!U!!!U!!\276!U!!\275\275!", "^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!null!!!null!!!null!!\276!null!!\275\275!" + "'", str2, "\275!null!!!null!!!null!!\276!null!!\275\275!");
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!", "NHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245!", "\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8RR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnull!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8RR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnull!");
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!", "~\200}}~\200}}~\200}}~\200}}\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272~\200}}~\200}}~\200}}~\200}}\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!", "TnullnullnullTnullnullnull!!!!TnullnullnullTnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!" + "'", str2, "!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!!");
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e!", "LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275!", "]]]]]]]]!!]]]]]]]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!" + "'", str2, "\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!");
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204!", "\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380\u037e\u0380\u0380!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!" + "'", str2, "\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!");
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!", "\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!" + "'", str2, "\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!!\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230!");
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!", "LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\326\325\330\330\325\326\330\330!", "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}L!!!\200\200}L!!!\200\200}L!!!\200\200}L!!!\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}L!!!\200\200}L!!!\200\200}L!!!\200\200}L!!!\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!", "\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}null!!!\200\200}null!!!\200\200}null!!!\200\200}null!!!\200\200null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~}null!!!\200\200}null!!!\200\200}null!!!\200\200}null!!!\200\200null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!" + "'", str2, "}null!!!\200\200}null!!!\200\200}null!!!\200\200}null!!!\200\200null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~}null!!!\200\200}null!!!\200\200}null!!!\200\200}null!!!\200\200null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!");
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!\200\200\u0346\u0348\u0348!", "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!!", "ppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnn!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8!!!!!!!" + "'", str2, "\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8!!!!!!!");
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!", "\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300!", "u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnull!" + "'", str2, "null\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnull!");
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120\u011e\u0120\u0120!", "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!" + "'", str2, "\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!");
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!", "uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!", "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!" + "'", str2, "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!!", "]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388!!!" + "'", str2, "\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388!!!");
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230\200}}`X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!", "\275^^^\275^^^\275^^^\275^^^^^\275\275^^\275\275^^\275\275^^\275\275\275^^^\275^^^\275^^^\275^^^^^\275\275^^\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!" + "'", str2, "!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!!^^^!^^^!^^^!^^^!^^^!^^^!^^^!^^^!");
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!" + "'", str2, "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``!", "UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``!" + "'", str2, "\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``!");
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnull]!]]]!]]]!]]nullnullnullnull]!]]]!]]]!]]!", "]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]!]]]!]]]!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]!]]]!]]]!]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]!]]]!]]]!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]!]]]!]]]!]]!");
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220\200\u01f8\u01fb\u01fb\220\220!", "UUUU!]UU!]UU!]UU!]UUUUUU!]UU!]UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220!" + "'", str2, "\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220!");
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!" + "'", str2, "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!");
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u03aa\u03aa\u03aa\u038a\u038a\u038a!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!", "}~\200\200}~\200\200UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!}~\200\200}~\200\200UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!!" + "'", str2, "\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!!!\276!\266\266~!!\276!\266\266~!!!");
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!\274\271\271\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!\274\271\271\u0346\u0348\u0348!");
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!U!!!U!!!U!!!U!!U!U!!!!U!U!!!!U!U!!!!U!U!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!null!null!!!!null!null!!!!null!null!!!!null!null!!!!!" + "'", str2, "!null!!!null!!!null!!!null!!null!null!!!!null!null!!!!null!null!!!!null!null!!!!!");
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!", "\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275~\316~~~\316~~~\316~~\275~\316~~~\316~~~\316~~\275~\316~~~\316~~~\316~~\275~\316~~~\316~~~\316~~~\316~~~\316~~\275\275~\316~~~\316~~\275\275~\316~~~\316~~\275\275~\316~~~\316~~\275\275\275~\316~~~\316~~~\316~~\275~\316~~~\316~~~\316~~\275~\316~~~\316~~~\316~~\275~\316~~~\316~~~\316~~~\316~~~\316~~\275\275~\316~~~\316~~\275\275!" + "'", str2, "\275~\316~~~\316~~~\316~~\275~\316~~~\316~~~\316~~\275~\316~~~\316~~~\316~~\275~\316~~~\316~~~\316~~~\316~~~\316~~\275\275~\316~~~\316~~\275\275~\316~~~\316~~\275\275~\316~~~\316~~\275\275\275~\316~~~\316~~~\316~~\275~\316~~~\316~~~\316~~\275~\316~~~\316~~~\316~~\275~\316~~~\316~~~\316~~~\316~~~\316~~\275\275~\316~~~\316~~\275\275!");
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!!", "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!!" + "'", str2, "!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!!");
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!", "\u0366\u0365\u0368\u0368\u028b\u028b\u028b\u028b\u028b\u028b\u028b\u028b!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!" + "'", str2, "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!");
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200\u0348\u0346\u0346!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!e!", "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!", "]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!]AAAnullnullnull\256\254\254]AAAnullnullnull\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b!" + "'", str2, "\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b!");
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHH!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253!", "ELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LELLLELLLELLLELLLELLLELLLELLLELL\253\253LELLLELLLELLLELLLELLLELLLELLLELL\253\253LELLLELLLELLLELLLELLLELLLELLLELL\253\253LELLLELLLELLLELLLELLLELLLELLLELL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LELLLELLLELLLELLLELLLELLLELLLELL\253\253LELLLELLLELLLELLLELLLELLLELLLELL\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LELLLELLLELLLELLLELLLELLLELLLELL\253\253LELLLELLLELLLELLLELLLELLLELLLELL\253\253LELLLELLLELLLELLLELLLELLLELLLELL\253\253LELLLELLLELLLELLLELLLELLLELLLELL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LELLLELLLELLLELLLELLLELLLELLLELL\253\253LELLLELLLELLLELLLELLLELLLELLLELL\253\253!");
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd!", "\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379\u0377\u0379\u0379!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379!" + "'", str2, "~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379!");
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]~}}^nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]]]!", "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e]]]]!" + "'", str2, "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e]]]]!");
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\275!~!!!~!!!~!!\276!~!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!!", "nulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvv!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!!" + "'", str2, "\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!!");
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214!", "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214!" + "'", str2, "\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214!");
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!", "}~\200\200}~\200\200nullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNNnullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNN}~\200\200}~\200\200nullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNNnullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L]LLL]LL!!L]LLL]LL!!L]LLL]LLL]LLL]LL!!L]LLL]LL!!L]LLL]LL!" + "'", str2, "L]LLL]LL!!L]LLL]LL!!L]LLL]LLL]LLL]LL!!L]LLL]LL!!L]LLL]LL!");
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c!", "!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullnull!" + "'", str2, "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullnull!");
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!", "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03c7\u03c7\u03c7\u03c7\u03c7\u03c7\u03c7\u03c7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03c7\u03c7\u03c7\u03c7!!!" + "'", str2, "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03c7\u03c7\u03c7\u03c7\u03c7\u03c7\u03c7\u03c7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03c7\u03c7\u03c7\u03c7!!!");
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!!", "\u02ebnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!!" + "'", str2, "z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!z{}}z{}}z{}}z{}}\266\267\271\271\266\267\271\271!!!!!!!");
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!", "!null!!!null!!!null!!!null!!null!null!!!!null!null!!!!null!null!!!!null!null!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!" + "'", str2, "!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!");
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!", "\u0346\u0348\u0348\u0348\342\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!" + "'", str2, "!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342\342!!!");
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!", "null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!" + "'", str2, "!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!!\236\236\236\236\236\236\236\236!");
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!", "!\276\276\276!\276\276\276!\276\276\276!\276\276\276\200}}`!\276\276\276!\276\276\276!\276\276\276!\276\276\276]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~!" + "'", str2, "\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~\276~~~!");
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!null`nullnullnull`nullnullnull`nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!null`nullnullnull`nullnullnull`nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!null`nullnullnull`nullnullnull`nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!null`nullnullnull`nullnullnull`nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!lll!lll!!!lll!lll!!!lll!lll!lll!lll!lll!lll!lll!lll!", "ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!", "!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!" + "'", str2, "!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!");
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!", "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u0346\u0348\u0348!", "NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!", "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!" + "'", str2, "\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!");
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!!eeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeeeeeee\220eeeeeeee\200~~eeee\220eeeeeeee\200~~eeee\220eeeeeeeeeeee\220eeeeeeee!", "!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ!!JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ!!JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ!!JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ!!JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ!" + "'", str2, "JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ!!JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ!!JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ!!JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ!!JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJ\200~~JJJJ\220JJJJJJJJJJJJ\220JJJJJJJJ!");
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu!", "ULLUULLUULLUUULLUULLUULLUUULLUULLUULLUUULLUULLUULLUU\200}}`ULLUULLUULLUUULLUULLUULLUUULLUULLUULLUUULLUULLUULLUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314!" + "'", str2, "~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314~}\200\200~}\200\200\254null\252\252\254null\252\252\314\314\254null\252\252\254null\252\252\314\314!");
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!" + "'", str2, "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!");
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200}}}!", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\200}}`ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200}}}!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\200}}}\200}}}\200\u02fa\200}}}\200}}}\200}}}!");
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`UU!!UU!!UU!!`UU!!UU!!UU!!!", "LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\216\216!!\216\216!!\216\216!!`\216\216!!\216\216!!\216\216!!!" + "'", str2, "`\216\216!!\216\216!!\216\216!!`\216\216!!\216\216!!\216\216!!!");
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN!", "]!H!!!H!!!H!!!H!!!H!!]]!H!!!H!!]]!H!!!H!!]]!H!!!H!!]]]!H!!!H!!!H!!!H!!!H!!]]!H!!!H!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!^```^```^```^```^```^```^```^```^```^```!!!!!!!!^```^```!!!!!!!!!");
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!", "nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230nullnullnullnull\226\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!" + "'", str2, "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!");
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b\u043e\u043c\u043b\u043b!", "\215}\215\215\215}\215\215\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\215}\215\215\215}\215\215!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!", "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!" + "'", str2, "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275]]]\275]]]!", "\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275]]]\275]]]!" + "'", str2, "\275]]]\275]]]!");
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!", "LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!" + "'", str2, "}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!");
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!", "n]nnn]nn!!n]nnn]nn!!n]nnn]nnn]nnn]nn!!n]nnn]nn!!n]nnn]nn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!" + "'", str2, "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!");
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!", "``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!!``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230\200}}```MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230]]!" + "'", str2, "``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230\200}}```MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM``MM\225\230\230]]!");
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull!", "nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!" + "'", str2, "\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!");
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!", "}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240!", "\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!" + "'", str2, "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nn!!uunnuunnuunnnn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!uunnuunnuunnnn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!!", "nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]]nullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "HH!!HH!!HHHH!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!null\335\335!!!!null\335\335!!!!!!!", "\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!!" + "'", str2, "U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!U\230LLnn!!!!U\230LLnn!!!!!!!");
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254!!!" + "'", str2, "\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254!!!");
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\200\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a\u013c\u013a\u013a\u013a]]!", "~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!!~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!!~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!!~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!!~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u014f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!", "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LJJJLJJJLJJJLJJJLJJJLJJJLJJJLJJJ!" + "'", str2, "LJJJLJJJLJJJLJJJLJJJLJJJLJJJLJJJ!");
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!!", "!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!!" + "'", str2, "L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!!");
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!", "!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!!" + "'", str2, "null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!!");
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!", "]f!!]f!!!!]f!!]f!!!!]f!!]f!!]f!!]f!!!!]f!!]f!!!!]f!!]f!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!", "fhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnullfhnullnullfhnullnull\226\226fhnullnullfhnullnull\226\226fhnullnullfhnullnullnullnullfhnullnullfhnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\260\260\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}}\260\260\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\260\260\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}}!" + "'", str2, "\260\260\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\260\260\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}}\260\260\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\260\260\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}}!");
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!", "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!" + "'", str2, "t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!");
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!", "!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!");
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!!!!~LLLLLLLL!!!!~LLLLLLLL!!!", "\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!", "\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388!!!", "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!!" + "'", str2, "null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!!");
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}!ULL!ULL!ULL~}}^}!ULL!ULL!ULL]]!", "LNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u0150\u0150\u014e\u0150\u0150\u014e\u0150\u0150\u014e\u0150\u0150\u014e\u0150\u0150\u014e\u0150\u0150]]!" + "'", str2, "\u014e\u0150\u0150\u014e\u0150\u0150\u014e\u0150\u0150\u014e\u0150\u0150\u014e\u0150\u0150\u014e\u0150\u0150]]!");
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276!", "]nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]nullnull!!nullnull!!!!nullnull!!nullnull!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276!" + "'", str2, "\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\u01f1\u01f2\u01f4\u01f4\276\276\276\276\276!");
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\254!!\254\254!!!", "\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254!!\254\254!!!" + "'", str2, "\254\254!!\254\254!!!");
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "hh!!hh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!", "}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!HHH!HHH}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!" + "'", str2, "\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!");
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275\275nullL]]]nullnullnullL]]]nullnull\275\275nullL]]]nullnullnullL]]]nullnull\275\275nullL]]]nullnullnullL]]]nullnull\275\275\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275nullL]]]nullnullnullL]]]nullnullnullL]]]nullnullnullL]]]nullnullnullL]]]nullnull\275\275nullL]]]nullnullnullL]]]nullnull\275\275!", "!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!" + "'", str2, "\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!!^^^]]]!!^^!!^^!!^^^]]]!!^^!!^^\275\275!");
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!", "\u0346\u0348\u0348\u0348\342\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!" + "'", str2, "!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!");
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}\200FHHH}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!", "!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!!\276N\266\266~NN\276N\266\266~NN!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!" + "'", str2, "\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!!\276~\266\266~~~\276~\266\266~~~!");
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "\253\254\256\256~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200\253\254\256\256~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!", "LnullLLLnullLL!!LnullLLLnullLL!!LnullLLLnullLLLnullLLLnullLL!!LnullLLLnullLL!!LnullLLLnullLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!" + "'", str2, "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!");
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0366\u0365\u0368\u0368\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300!!\300\300\300\300\300\300\300\300\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnull~~~~~~~!", "LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~!" + "'", str2, "nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~nullnullnullnullUUNNUUNNUUNNnullnullnullnullUUNNUUNNUUNN~~~~~~~!");
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUUUUUUUUUUUUUUUUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!", "nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230!" + "'", str2, "\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230!");
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn!", "nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU!" + "'", str2, "``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU``UUUUUUUU!");
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225!", "}nullnullnull~}}^}nullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!" + "'", str2, "\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!");
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275!!\275\275!!!!\275\275!!\275\275!!!!!", "nullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!");
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!", "LUUULUUU\254\254LUUULUUU\254\254]]LUUULUUU\254\254LUUULUUU\254\254]]\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254]]LUUULUUU\254\254LUUULUUU\254\254]]\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab!", "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\225!", "!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\225!" + "'", str2, "!\225!");
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!", "nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!");
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FF!!FF!!!", "!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276!", "\u0366\u0365\u0368\u0368\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276!" + "'", str2, "nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276!");
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161\u0162\u0161nullnull!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162!" + "'", str2, "\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162!");
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnull!", "LL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!" + "'", str2, "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!");
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!" + "'", str2, "!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!");
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!!", "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!!" + "'", str2, "NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!!");
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!", "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!" + "'", str2, "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!!", "null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230\200}}`null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!!" + "'", str2, "UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!!");
    }
}
