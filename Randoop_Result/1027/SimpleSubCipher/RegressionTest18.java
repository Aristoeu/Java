package SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hi!", "NLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0107\u0105\u0109\u0109\u0107\u0105\u0109\u0109!", "!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!" + "'", str2, "\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!");
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104!", "EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF!" + "'", str2, "~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF!");
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!", "\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!", "\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\200\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!" + "'", str2, "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULL!", "\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!nullnull!!nullnull!!nullnull!!nullnull!!\216null!!\216null!!\216null!!!");
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237!", "\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150nullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237!" + "'", str2, "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!\242UNLLUNLL!!\237\237\242UNLLUNLL!!\237\237!");
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNNNLNNNLNNNLNNN\200}}`LNNNLNNNLNNNLNNN]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("PNNNnull!!PNNNnull!!!", "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nulluuu\225\230nullnull!!nulluuu\225\230nullnull!!!" + "'", str2, "nulluuu\225\230nullnull!!nulluuu\225\230nullnull!!!");
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUU!", "null\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnullnull\230nullnull\273nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`UNUUUNUUUNUU`UNUUUNUUUNUU!", "\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198!" + "'", str2, "\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198!");
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!", "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!" + "'", str2, "\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!");
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253!", "\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0106\u0106!" + "'", str2, "\u0106\u0106!");
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\225\226\230\230\225\226\230\230\225\226\230\230\225\226\230\230\u0348\u0346\u0346!", "OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\225\226\230\230\225\226\230\230\225\226\230\230\225\226\230\230\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\225\226\230\230\225\226\230\230\225\226\230\230\225\226\230\230\u0348\u0346\u0346!");
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!", "unllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200!" + "'", str2, "nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200!");
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!!", "RRRRRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!!" + "'", str2, "null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!null}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnullnull}nullnull!!!");
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200}}`!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]]]!", "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200}}`!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]]]!" + "'", str2, "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200}}`!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]]]!");
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346dnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll~}\200\200~}\200\200llll!llllllllllll!llllllll!lll!lllllll!llllllllllll!llllllll!lll!lll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!}`}}}`}}}`}}LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!}`}}}`}}}`}}LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!}`}}}`}}}`}}LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!}`}}}`}}}`}}LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("OO]]OO]]OO]]OO]]~}}^OO]]OO]]OO]]OO]]]]!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!" + "'", str2, "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!");
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null~ssnull~ss!!null~ssnull~ss!!null~ssnull~ssnull~ssnull~ss!!null~ssnull~ss!!null~ssnull~ss!", "LL!!LLLLLLLLLLLLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLLLLLLLLLLLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!~!!LL!!~!!!!LL!!~!!LL!!~!!!!LL!!~!!LL!!~!!LL!!~!!LL!!~!!!!LL!!~!!LL!!~!!!!LL!!~!!LL!!~!!!" + "'", str2, "LL!!~!!LL!!~!!!!LL!!~!!LL!!~!!!!LL!!~!!LL!!~!!LL!!~!!LL!!~!!!!LL!!~!!LL!!~!!!!LL!!~!!LL!!~!!!");
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!", "\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "nulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvv!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!");
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e!", "!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03dd\u03de\u03e0\u03e0nullnullnullnull!", "!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!" + "'", str2, "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!");
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368unllunllunllunll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!" + "'", str2, "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!");
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275\u0346\u0348\u0348!", "!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0346\u0348\u0348!");
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!", "]!``]!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!" + "'", str2, "!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!");
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}nullnull\200null}}\200null}}!", "nullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}!" + "'", str2, "LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}LNUULNUU\200LNUU}}\200LNUU}}!");
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\u0137\u0136\u0136\275\275\u0137\u0136\u0136\u0137\u0136\u0136\275\275!", "\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\275\216\220W\216\216\220\220\216\220W\216\216\220\220\275\275\216\220W\216\216\220\220\216\220W\216\216\220\220\275\275\216\220W\216\216\220\220\216\220W\216\216\220\220\275\275\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\275\216\220W\216\216\220\220\216\220W\216\216\220\220\275\275!" + "'", str2, "\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\275\216\220W\216\216\220\220\216\220W\216\216\220\220\275\275\216\220W\216\216\220\220\216\220W\216\216\220\220\275\275\216\220W\216\216\220\220\216\220W\216\216\220\220\275\275\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\216\220W\216\216\220\220\275\275\216\220W\216\216\220\220\216\220W\216\216\220\220\275\275!");
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\220\335\336\340\340\335\336\340\340\200}}`\335\336\340\340\220\335\336\340\340\335\336\340\340]]!", "L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230\200}}`L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\220nullnullnullnullnullnullnullnull\200}}`nullnullnullnull\220nullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnull\220nullnullnullnullnullnullnullnull\200}}`nullnullnullnull\220nullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!!", "\234!nullnullnullnullnullnullnullnull\234!nullnullnullnullnullnullnullnull!!\234!nullnullnullnullnullnullnullnull\234!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!" + "'", str2, "UNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!");
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u0317\u031a\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u0317\u031a\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u0317\u031a\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u0317\u031a\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!", "\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!\260]]!!]]!!]]!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031a]]!!]]!!!" + "'", str2, "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031a]]!!]]!!!");
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("P!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnullP!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnull!", "!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276N\225\225\276N\225\225\200\200\276N\225\225\276N\225\225\200\200\276N\225\225\276N\225\225\200\200\276\276N\225\225\276N\225\225\200\200\275\275!", "\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!\261ULL\261ULL\261ULL\261ULL\261ULL\261ULL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276U\225\225\276U\225\225\200\200\276U\225\225\276U\225\225\200\200\276U\225\225\276U\225\225\200\200\276\276U\225\225\276U\225\225\200\200\275\275!" + "'", str2, "\275\276U\225\225\276U\225\225\200\200\276U\225\225\276U\225\225\200\200\276U\225\225\276U\225\225\200\200\276\276U\225\225\276U\225\225\200\200\275\275!");
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!", "]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!!]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!!]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!!]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!!]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn!", "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!!" + "'", str2, "``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!!");
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!!", "N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!!" + "'", str2, "~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!~!~!!\200\200~!~!!\200\200\200\200~!~!!\200\200~!~!!\200\200\200\200!!!");
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FLLLFLLLLLFLLLFLLLLL!!FLLLFLLLLLFLLLFLLLLL!!FLLLFLLLLLFLLLFLLLLLFLLLFLLLLLFLLLFLLLLL!!FLLLFLLLLLFLLLFLLLLL!!FLLLFLLLLLFLLLFLLLLL!", "\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNN!" + "'", str2, "UNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNN!");
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^^^^]null^^]null^^]null^^]null^^^^^^]null^^]null^^!", "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126^^!" + "'", str2, "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126^^!");
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\230!", "^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\230!" + "'", str2, "!\230!");
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!", "`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!" + "'", str2, "\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!");
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200!!!!!", "NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200!!!!!" + "'", str2, "\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200!!!!!");
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\352\351\354\354\352\351\354\354!", "nullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnullee\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\254\256\256~\254\256\256!" + "'", str2, "~\254\256\256~\254\256\256!");
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!", "!\253\256\256]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!" + "'", str2, "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`]```]``!!`]```]``!!`]```]```]```]``!!`]```]``!!`]```]``!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`]```]``!!`]```]``!!`]```]```]```]``!!`]```]``!!`]```]``!" + "'", str2, "`]```]``!!`]```]``!!`]```]```]```]``!!`]```]``!!`]```]``!");
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214!", "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!");
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!", "\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011anullnullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011aLL!" + "'", str2, "\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011aLL!");
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]!", "\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]!" + "'", str2, "\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^\270]^^!\270]]!\270]]!");
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "!!UU!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("l!nnl!nnnullnulll!nnl!nnnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnull!" + "'", str2, "null!nullnullnull!nullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!", "\230\u01e0\u01e0\u01e0!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!" + "'", str2, "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!");
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "NULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("qrttqrttnullnullqrttqrttnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("vvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuu\200}}`vvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuuvvuu]]!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\200\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!" + "'", str2, "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\200\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!");
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!" + "'", str2, "!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!");
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200``NN``NN}~\200\200}~\200\200``NN``NN}~\200\200}~\200\200``NN``NN}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200``NN``NN}~\200\200}~\200\200``NN``NN}~\200\200}~\200\200``NN``NN}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!", "`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2!!!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!nullnull!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!!``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!!!" + "'", str2, "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!!``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLnullnullnullnullnullnullnullnullLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!", "null]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!" + "'", str2, "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!");
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b\u017b!", "\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!");
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!", "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016d\u0170\u0170\u014d\u014e\u0150\u0150!", "\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!", "!null!!!null!!!null!!!null!!null!null!!!!null!null!!!!null!null!!!!null!null!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!LL!!!!LL!!LL!!!" + "'", str2, "!!LL!!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!!LL!!LL!!LL!!LL!!!!LL!!LL!!!");
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275\u0346\u0348\u0348!");
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnull!", "N!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128!" + "'", str2, "nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128nullnullnullnullnullnullnullnull\374\u0128\u0128\374\u0128\u0128!");
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull!", "!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010bnullnull!" + "'", str2, "\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010b\u010bnullnull!");
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab\u01ac\u01ac\u01ab\u01ab!", "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!}~\200\200}~\200\200UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!!", "!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!I!!!I!!!I!!!I!!^!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!^!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!}~\200\200}~\200\200!I!!!I!!!I!!!I!!^!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!^!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!" + "'", str2, "}~\200\200}~\200\200!I!!!I!!!I!!!I!!^!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!^!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!}~\200\200}~\200\200!I!!!I!!!I!!!I!!^!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!^!I!!!I!!!I!!!I!!!I!!!I!!!I!!!I!!!");
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\253nullnull\253\253nullnull}}\253\253nullnull\253\253nullnull}}!", "\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272\u0272nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\335\336\340\340\335\336\340\340\253\253\335\336\340\340\335\336\340\340}}\253\253\335\336\340\340\335\336\340\340\253\253\335\336\340\340\335\336\340\340}}!" + "'", str2, "\253\253\335\336\340\340\335\336\340\340\253\253\335\336\340\340\335\336\340\340}}\253\253\335\336\340\340\335\336\340\340\253\253\335\336\340\340\335\336\340\340}}!");
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!", "!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!", "efhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!", "LNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275NNN\275NNN\275NNN\275NNN\275NNN\275NNN\275NNN\275NNN!" + "'", str2, "\275NNN\275NNN\275NNN\275NNN\275NNN\275NNN\275NNN\275NNN!");
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ab!", "\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!" + "'", str2, "NN!");
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!!\373\374\376\376\225\223\223\275\275\275\373\374\376\376\225\223\223\275\275\275!", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!" + "'", str2, "nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!");
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~!", "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~!" + "'", str2, "}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~!");
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "EFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!!!", "\276\276nullnull\276\276nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!", "LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!" + "'", str2, "!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!");
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!", "!!]]!!]]N!!!N!!!!!]]!!]]N!!!N!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!" + "'", str2, "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!", "N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN\200\200\225\230\230NN\200\200\225\230\230NN\200\200\225\230\230NN\200\200\225\230\230\200}}`NN\200\200\225\230\230NN\200\200\225\230\230NN\200\200\225\230\230NN\200\200\225\230\230]]!" + "'", str2, "NN\200\200\225\230\230NN\200\200\225\230\230NN\200\200\225\230\230NN\200\200\225\230\230\200}}`NN\200\200\225\230\230NN\200\200\225\230\230NN\200\200\225\230\230NN\200\200\225\230\230]]!");
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!", "UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!UNLLUNLLUNLLUNLL\256\254\254UNLLUNLLUNLLUNLL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!" + "'", str2, "!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!!!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!\214\214\214!");
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!", "\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u028d\u028e\u0290\u0290nullnullnullnull!", "\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!!\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!!\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!!\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!!\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u018c\u018d\u018f\u018f\u018c\u018d\u018f\u018f\u018c\u018d\u018f\u018f\u018c\u018d\u018f\u018f!" + "'", str2, "\u018c\u018d\u018f\u018f\u018c\u018d\u018f\u018f\u018c\u018d\u018f\u018f\u018c\u018d\u018f\u018f!");
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("v!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnull!", "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULL!" + "'", str2, "L!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULLL!LULLLULL!");
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "hnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLLULLLULLLULLLULLLULLLULLLULLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0248\u0246\u0246\u0246\u0348\u0346\u0346!", "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230!");
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!", "\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!!!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!!!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!!!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!!!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!" + "'", str2, "!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!!!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!!!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!!!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!!!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!\275\275\275!\275\275\275!\275\275\275!\275\275\275\236\276\276!");
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215null!!!null!!!null!!!null!!!\215}\215\215\215}\215\215!", "!!!nulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleffnulleff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215NNFF!!!NNFF!!!NNFF!!!NNFF!!!\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215NNFF!!!NNFF!!!NNFF!!!NNFF!!!\215}\215\215\215}\215\215!");
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!", "t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!" + "'", str2, "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!");
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]\204]]]\204]]]\204]]]\204]]]]]]]]]]]]]]]]]]]\204]]]\204]]]\204]]]\204]]]]]]]]]]!", "!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\204]]]\204]]]\204]]]\204]]]]]]]]]]]]]]]]]]]\204]]]\204]]]\204]]]\204]]]]]]]]]]!" + "'", str2, "]\204]]]\204]]]\204]]]\204]]]]]]]]]]]]]]]]]]]\204]]]\204]]]\204]]]\204]]]]]]]]]]!");
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]!NN]!NN]!NN]!NN\200}}`]!NN]!NN]!NN]!NN]]!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\200\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a]]!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\200\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a]]!");
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!", "\u0104\u0104!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnull!", "~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0!" + "'", str2, "\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0\u02be\u02c0\u02c0!");
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!", "\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LL!", "LLUU\253\253\253\200}}`LLUU\253\253\253]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LL!" + "'", str2, "L!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LL!");
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u0348\u0346\u0346!", "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256!", "nullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\254\275\254\254\254\275\254\254!!\254\275\254\254\254\275\254\254!!!", "!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\275\254\254\254\275\254\254!!\254\275\254\254\254\275\254\254!!!" + "'", str2, "\254\275\254\254\254\275\254\254!!\254\275\254\254\254\275\254\254!!!");
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0346!!!!", "uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!uu}}uu}}uu}}uu}}uu}}uu}}uu}}uu}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346!!!!" + "'", str2, "\u0346\u0346!!!!");
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230\200}}`LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230]]!", "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull^^\225\230\230nullnull^^\225\230\230nullnull^^\225\230\230nullnull^^\225\230\230\200}}`nullnull^^\225\230\230nullnull^^\225\230\230nullnull^^\225\230\230nullnull^^\225\230\230]]!" + "'", str2, "nullnull^^\225\230\230nullnull^^\225\230\230nullnull^^\225\230\230nullnull^^\225\230\230\200}}`nullnull^^\225\230\230nullnull^^\225\230\230nullnull^^\225\230\230nullnull^^\225\230\230]]!");
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!", "U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!" + "'", str2, "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!");
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!!", "LNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!!" + "'", str2, "LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!LL}}LL}}!!!");
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025e\u025enullnull!!!!!", "LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243!!!!!" + "'", str2, "\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243\u0244\u0246\u0243\u0243!!!!!");
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLL!", "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226\u0348\u0346\u0346!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226\u0348\u0346\u0346!");
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!", "!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256````````````````\253\254\256\256````````!", "nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256````````````````\253\254\256\256````````!" + "'", str2, "\253\254\256\256````````````````\253\254\256\256````````!");
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!", "~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!" + "'", str2, "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c!", "!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019dnullnullnullnull!" + "'", str2, "\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019dnullnullnullnull!");
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "`UNUUUNUUUNUU`UNUUUNUUUNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!", "\215}\215\215\215}\215\215\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\215}\215\215\215}\215\215!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e!" + "'", str2, "\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e\u014f\u014b\u014b\u014f\u014b\u014b\u014e\u014e!");
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!", "ULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!");
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnullnull!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!" + "'", str2, "!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!");
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnull!", "!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!\276\276\275!\276\276!", "L\204LLL\204LLL\204LLL\204LLLLLLLLLLLLLLLLLLL\204LLL\204LLL\204LLL\204LLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!\276\276\275!\276\276!" + "'", str2, "\275!\276\276\275!\276\276!");
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275NULLNULLNULL\276NULL\275\275!", "\u0348l!!\200\u0348l!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullJJnullnullJJnullnullJJ\276nullnullJJ\275\275!" + "'", str2, "\275nullnullJJnullnullJJnullnullJJ\276nullnullJJ\275\275!");
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`!!nullnull!!nullnull!!nullnull`!!nullnull!!nullnull!!nullnull!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!LN~~LN~~!!LN~~LN~~!!LN~~LN~~`!!LN~~LN~~!!LN~~LN~~!!LN~~LN~~!" + "'", str2, "`!!LN~~LN~~!!LN~~LN~~!!LN~~LN~~`!!LN~~LN~~!!LN~~LN~~!!LN~~LN~~!");
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!", "nn!!uunnuunnuunnnn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!uunnuunnuunnnn!!nn!!nn!!nn!!nn!!nn!!nn!!nn!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull!" + "'", str2, "~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull~}\200\200~}\200\200NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnullNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!nullnull!");
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!!!", "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!", "\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!" + "'", str2, "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336!!!\336!!!!", "}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!!" + "'", str2, "null!!!null!!!!");
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214!", "``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!``!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214!" + "'", str2, "\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214!");
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\266\266!!\266\266!!\266\266!!\266\266\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\266\266!!\266\266!!\266\266!!\266\266\u0346\u0348\u0348!");
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("lluulluu!!lluulluu!!lluulluulluulluu!!lluulluu!!lluulluu!", "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204\201\201\204\204\201\201!!\204\204\201\201\204\204\201\201!!\204\204\201\201\204\204\201\201\204\204\201\201\204\204\201\201!!\204\204\201\201\204\204\201\201!!\204\204\201\201\204\204\201\201!" + "'", str2, "\204\204\201\201\204\204\201\201!!\204\204\201\201\204\204\201\201!!\204\204\201\201\204\204\201\201\204\204\201\201\204\204\201\201!!\204\204\201\201\204\204\201\201!!\204\204\201\201\204\204\201\201!");
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u013d\u013e\u0140\u0140\u013d\u013e\u0140\u0140nullnull!", "!U!!!U!!!U!!!U!!U!U!!!!U!U!!!!U!U!!!!U!U!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullu!!!u!!!u!!!u!!!nullnullnullnullu!!!u!!!!" + "'", str2, "nullnullnullnullu!!!u!!!u!!!u!!!nullnullnullnullu!!!u!!!!");
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!" + "'", str2, "!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!");
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\275\300\300\300!", "n\253uun\253\u035e\u035en\253uun\253\u035e\u035e!!!!n\253uun\253\u035e\u035en\253uun\253\u035e\u035e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215\273\275\275\275\273\275\275\275\273\275\275\275\273\275\275\275\215}\215\215\215}\215\215!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\273\275\275\275\273\275\275\275\273\275\275\275\273\275\275\275\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\273\275\275\275\273\275\275\275\273\275\275\275\273\275\275\275\215}\215\215\215}\215\215!");
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!nullnull!", "\u0366\u0365\u0368\u0368\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullnullnullnullnullnullnullnull!" + "'", str2, "!!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200\u0348\u0346\u0346!", "!LLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull``nullnullnull``nullnull``nullnull``nullnullnull``nullnull``}~\200\200}~\200\200nullnull``nullnullnull``nullnull``nullnull``nullnullnull``nullnull``}~\200\200}~\200\200nullnull``nullnullnull``nullnull``nullnull``nullnullnull``nullnull``}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull``nullnullnull``nullnull``nullnull``nullnullnull``nullnull``}~\200\200}~\200\200nullnull``nullnullnull``nullnull``nullnull``nullnullnull``nullnull``}~\200\200}~\200\200nullnull``nullnullnull``nullnull``nullnull``nullnullnull``nullnull``}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230\230!\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214!", "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214!" + "'", str2, "\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214\u0348\u0348~~!\214\214!");
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLUULLUULLUUULLUULLUULLUUULLUULLUULLUUULLUULLUULLUU\200}}`ULLUULLUULLUUULLUULLUULLUUULLUULLUULLUUULLUULLUULLUU]]!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]!]]]!]]]!]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]!]]]!]]]!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLNNLLNNLLNNNLLNNLLNNLLNNNLLNNLLNNLLNNNLLNNLLNNLLNN\200}}`NLLNNLLNNLLNNNLLNNLLNNLLNNNLLNNLLNNLLNNNLLNNLLNNLLNN]]!" + "'", str2, "NLLNNLLNNLLNNNLLNNLLNNLLNNNLLNNLLNNLLNNNLLNNLLNNLLNN\200}}`NLLNNLLNNLLNNNLLNNLLNNLLNNNLLNNLLNNLLNNNLLNNLLNNLLNN]]!");
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260!", "\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU\276LNUULNUULNUULNUU\275\275!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275!");
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!", "~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~!!nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~!!nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~!!nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~!!nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~!" + "'", str2, "nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~!!nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~!!nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~!!nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~!!nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~!");
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230!", "\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230!" + "'", str2, "~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230!");
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!", "\215}\215\215\215}\215\215\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d!" + "'", str2, "\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d\u0243\u0243\u017d\u017d!");
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!!", "LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!!" + "'", str2, "]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!!");
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!", "orrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!" + "'", str2, "\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275!]]]!]]]\275\275\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]\275!]]]!]]]!]]]!]]]!]]]\275\275!]]]!]]]\275\275!");
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200!^NN!^NN}~\200\200}~\200\200!^NN!^NN!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0114\u0114\u0114\u0114}~\200\200}~\200\200\u0114\u0114\u0114\u0114!" + "'", str2, "}~\200\200}~\200\200\u0114\u0114\u0114\u0114}~\200\200}~\200\200\u0114\u0114\u0114\u0114!");
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150!!!", "nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!nullFHHnullFHH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!\200}}`!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!]]!" + "'", str2, "!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!\200}}`!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!]]!");
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN]]NN]]UNNNUNNNNN]]NN]]UNNNUNNN!", "\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01db\u01db\u01db\u01db~~~!" + "'", str2, "\u01db\u01db\u01db\u01db~~~!");
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NNNNN!!NNNNN!!NNNNN!!NNN\200}}`NN!!NNNNN!!NNNNN!!NNNNN!!NNN]]!" + "'", str2, "NN!!NNNNN!!NNNNN!!NNNNN!!NNN\200}}`NN!!NNNNN!!NNNNN!!NNNNN!!NNN]]!");
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!", "\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\300N\275\275\300N\275\275\300N\275\275\300N\275\275^\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275^\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275}~\200\200}~\200\200\300N\275\275\300N\275\275\300N\275\275\300N\275\275^\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275^\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275!" + "'", str2, "}~\200\200}~\200\200\300N\275\275\300N\275\275\300N\275\275\300N\275\275^\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275^\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275}~\200\200}~\200\200\300N\275\275\300N\275\275\300N\275\275\300N\275\275^\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275^\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275\300N\275\275!");
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!", "LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]null]]]null]]!!]null]]]null]]!!]null]]]null]]!!]null]]]null]]!!]null]]]null]]!!]null]]]null]]!!]null]]]null]]!!]null]]]null]]!!!" + "'", str2, "]null]]]null]]!!]null]]]null]]!!]null]]]null]]!!]null]]]null]]!!]null]]]null]]!!]null]]]null]]!!]null]]]null]]!!]null]]]null]]!!!");
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!", "\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!", "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!", "\275!!!!!!!!!!!!\276!!!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\214\214!!\214\214!!\214\214!!\214\214\u0346\u0348\u0348!", "u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\214\214!!\214\214!!\214\214!!\214\214\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\214\214!!\214\214!!\214\214!!\214\214\u0346\u0348\u0348!");
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0226!", "\u0420\u0420\u0420\u0420!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!", "\u0259\u0259\u0256\u0256\u0256\u0256\u0259\u0259!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!" + "'", str2, "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214!", "!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214!" + "'", str2, "LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214LLUULLUULNLLLNLLLLUULLUULNLLLNLL\214\214!");
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u017d\u017d\u017d\u017d\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u017d\u017d\u017d\u017d\u0348\u0346\u0346!");
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UUUUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UUUUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!" + "'", str2, "UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UUUUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!");
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "nullnullnullnull\220nullnullnullnullnullnullnullnull\200}}`nullnullnullnull\220nullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0!", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("OO]]OO]]OO]]OO]]~}}^OO]]OO]]OO]]OO]]]]!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!" + "'", str2, "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!");
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\200\200\u0346\u0348\u0348!", "~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijll!", "\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254\u038c\u0389\u0389\u0389\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!", "U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!U!~~U!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!" + "'", str2, "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!");
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!", "null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULNNULNNULNNULNNULNN!" + "'", str2, "ULNNULNNULNNULNNULNN!");
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("j!!!j!!!j!!!j!!!j!!!j!!!j!!!j!!!!", "\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230\200}}`U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230]]!", "!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230\200}}`F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230]]!" + "'", str2, "F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230\200}}`F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230F!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FF\225\230\230]]!");
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225!", "null^^^nullnull^^nullnull^^nullnull^^nullnull^^null^^^nullnull^^nullnull^^!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225!" + "'", str2, "\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\275\276^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL\225\225!");
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!!", "\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LLL!\275\275L!\275\275LL!", "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UU!" + "'", str2, "U!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UU!");
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}!\200\200}!\200\200}!\200\200}!\200\200\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}!\200\200}!\200\200}!\200\200}!\200\200\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215!" + "'", str2, "}!\200\200}!\200\200}!\200\200}!\200\200\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215\230X\215\215!");
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL!", "\367!UNLLUNLL\367!UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!!" + "'", str2, "\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!\200N!!!N!!!N!!!!");
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031aU`UUU`UU!", "UUXXUUXXXXUUXXUUXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031aP`PPP`PP!" + "'", str2, "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031aP`PPP`PP!");
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!!", "~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!!" + "'", str2, "]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!]~^\200\200``]~^\200\200````]~^\200\200``]~^\200\200````!!!");
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0178\u0177\u017a\u017a\u0178\u0177\u017a\u017a\u0178\u0177\u017a\u017a\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0178\u0177\u017a\u017a\u0178\u0177\u017a\u017a\u0178\u0177\u017a\u017a\u0346\u0348\u0348!");
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!", "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!");
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!", "\275```\275```\275```\275`````\275\275``\275\275``\275\275``\275\275\275```\275```\275```\275`````\275\275``\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!" + "'", str2, "]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275]````!!]````!!]````!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!");
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!", "UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!" + "'", str2, "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!");
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200!^NN!^NN}~\200\200}~\200\200!^NN!^NN!", "hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!^nullnull!^nullnull}~\200\200}~\200\200!^nullnull!^nullnull!" + "'", str2, "}~\200\200}~\200\200!^nullnull!^nullnull}~\200\200}~\200\200!^nullnull!^nullnull!");
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!", "!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!" + "'", str2, "\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!");
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275~~\275\275~~\275\275\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275!", "HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275~~\275\275~~\275\275\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275!" + "'", str2, "\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275~~\275\275~~\275\275\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275!");
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347!", "nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241!!\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\236\237\241\241\u0346\u0348\u0348!");
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!\200\200\u0346\u0348\u0348!", "~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!!!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!!!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!\300\275\275!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\255\256\260\260\255\256\260\260!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faNULLNULLNULL!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faNULLNULLNULL!");
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d!", "!!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``!`!!!`!!``\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]]!!!", "\215}\215\215\215}\215\215null!!!null!!!null!!!null!!!\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]]!!!" + "'", str2, "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]]!!!");
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!UUU!UUU!UUU!UUU\200}}`!UUU!UUU!UUU!UUU]]!", "!\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!");
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!", "\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!" + "'", str2, "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!");
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUU!", "!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!!", "!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275!!!" + "'", str2, "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275\u01ac\275!!!");
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "LNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLLLNUULNUULLLNUULNUULLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLL!" + "'", str2, "LLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLLLLLLLLLLNNLLNNLL!");
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNNNNLLNNLLNNNN!", "nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLLLUULLUULLLL!" + "'", str2, "UULLUULLLLUULLUULLLL!");
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]!", "hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]!" + "'", str2, "HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^HHHH]^^!HHHH]]!HHHH]]!");
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!" + "'", str2, "!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!");
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126^^!", "HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^^^^]HHnullnull^^]HHnullnull^^]HHnullnull^^]HHnullnull^^^^^^]HHnullnull^^]HHnullnull^^!" + "'", str2, "^^^^]HHnullnull^^]HHnullnull^^]HHnullnull^^]HHnullnull^^^^^^]HHnullnull^^]HHnullnull^^!");
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!nullnullnull\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!\340\340!!!", "n]nnn]nn!!n]nnn]nn!!n]nnn]nnn]nnn]nn!!n]nnn]nn!!n]nnn]nn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!NN]]NN]]NN]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!NN]]NN]]NN]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!NN]]NN]]NN]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!NN]]NN]]NN]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!", "~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!!", "!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!!" + "'", str2, "\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!\266!!!!!TTT\266\266!!TTT\266\266!!!!!!!");
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]LNLLLNLL]]LNLLLNLL]]]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]!", "!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]!" + "'", str2, "]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!", "\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266!", "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266!" + "'", str2, "UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266UUUUUUUU\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```!", "!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!!\256\211\211\200\200\254\254\256\211\211\200\200\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```!" + "'", str2, "~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```!");
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!!", "\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!\220\220\216\216\220\220\216\216!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!");
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLL!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`UNUUUNUUUNUU`UNUUUNUUUNUU!", "\u0366\u0365\u0368\u0368\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!", "\260\260nullnullnullnullnullnullnullnull\260\260nullnullnullnullnullnullnullnull}}\260\260nullnullnullnullnullnullnullnull\260\260nullnullnullnullnullnullnullnull}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!" + "'", str2, "\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368\u0346\u0368\u0368!");
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("orrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrr!", "fehhfehhfehhfehhfehhfehhfehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "heeeheeeeeheeeheeeeeheeeheeeeeheeeheeeeeheeeheeeeeheeeheeeeeheeeheeeeeheeeheeeee!" + "'", str2, "heeeheeeeeheeeheeeeeheeeheeeeeheeeheeeeeheeeheeeeeheeeheeeeeheeeheeeeeheeeheeeee!");
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!", "\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\u031a\u031a\225\225\215}\215\215\215}\215\215!");
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNN!", "UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU!" + "'", str2, "\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU!");
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!", "\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!" + "'", str2, "!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!");
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104!!!!!" + "'", str2, "\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104\u0101\u0104\u0104!!!!!");
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``!", "!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``!" + "'", str2, "\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``\227\232```\227\232``\227\232``!");
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL]]LL]]LLLLLLLLLL]]LL]]LLLLLLLL!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!", "!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276!", "W!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276!" + "'", str2, "\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276!");
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLL!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxx!" + "'", str2, "vnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxxvnullxxvnullxxnullvxxnullvxx!");
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!", "!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU~}}^!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU!LNUULNUULNUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!", "\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!" + "'", str2, "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!");
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108```!", "unllNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```!" + "'", str2, "nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```!");
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!");
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200}}!", "\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}!" + "'", str2, "nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}!");
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HFFFHFFF!", "\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346\u013d\u0346~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214!", "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````\214\214````````````````````````````````\214\214````````````````````````````````\214\214````````````````````````````````\214\214````````````````````````````````\214\214````````````````````````````````\214\214````````````````````````````````\214\214````````````````````````````````\214\214!" + "'", str2, "````````````````````````````````\214\214````````````````````````````````\214\214````````````````````````````````\214\214````````````````````````````````\214\214````````````````````````````````\214\214````````````````````````````````\214\214````````````````````````````````\214\214````````````````````````````````\214\214!");
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUU!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!", "\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!" + "'", str2, "\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!");
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!", "nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230\200}}`nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UN\230\230UUUUN\230\230UUUUN\230\230UUUUN\230\230UUU\200}}`UN\230\230UUUUN\230\230UUUUN\230\230UUUUN\230\230UUU]]!" + "'", str2, "UN\230\230UUUUN\230\230UUUUN\230\230UUUUN\230\230UUU\200}}`UN\230\230UUUUN\230\230UUUUN\230\230UUUUN\230\230UUU]]!");
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275``NNNNNNNN``NNNNNNNN``NNNNNNNN\276``NNNNNNNN\275\275!", "l!lll!lll!lll!lll!lll!lll!lll!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull\276``nullnullnullnullnullnullnullnull\275\275!" + "'", str2, "\275``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull\276``nullnullnullnullnullnullnullnull\275\275!");
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\276\276\276\276\276!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276\276\276!!!" + "'", str2, "!\276\276\276\276\276!!!");
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106!", "L!!!L!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!!nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!!nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!!nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!!nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!" + "'", str2, "nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!!nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!!nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!!nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!!nullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnullnullnullee!nullnull!");
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!", "null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204null\201\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!" + "'", str2, "\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!");
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!", "\275\u0104\u0104\u0104\u0104\u0104\u0104\276\u0104\u0104\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!" + "'", str2, "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!");
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fLLL!", "\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv!", "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!", "eeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!" + "'", str2, "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!");
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullCCCnullCCCnullCCCnullCCC\200}}`nullCCCnullCCCnullCCCnullCCC]]!", "`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLL!!!NLLL!!!NLLL!!!NLLL!!!\200}}`NLLL!!!NLLL!!!NLLL!!!NLLL!!!]]!" + "'", str2, "NLLL!!!NLLL!!!NLLL!!!NLLL!!!\200}}`NLLL!!!NLLL!!!NLLL!!!NLLL!!!]]!");
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!!", "LLLL\276LLLLLLL\276\276LLLLL\276\276LLLLL\276\276LLLLL\276\276LLLL\276LLLLLLL\276\276LLLLL\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!!" + "'", str2, "nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!nullLLLLLLLLLLLLLLLLLLLLnullnullLLLLLLLLnullnull!!!!!!!");
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijll!", "\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!", "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!" + "'", str2, "\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!!\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~\216\216!~~~!~~~!");
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!!" + "'", str2, "\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!\200\200UU\200\200UU!!!");
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u03c0\u03c0\u03c0\u03c0!!\200\200\u0346\u0348\u0348!", "null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!nullnullnullnull!", "Le!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LLL!LLL!LLL!LLL!" + "'", str2, "!!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUU\253\253\253\200}}`LLUU\253\253\253]]!", "\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220nullnull\253\253\253\200}}`\220\220nullnull\253\253\253]]!" + "'", str2, "\220\220nullnull\253\253\253\200}}`\220\220nullnull\253\253\253]]!");
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132\u012f\u0130\u0132\u0132nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214!", "~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214!" + "'", str2, "\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214\u029e\u02a0\u029e\u029e\u029e\u02a0\u029e\u029e\u02a0\u029e\u029e\u029e\u029e\214\214\u02a0\u029e\u029e\u029e\u029e\214\214!");
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0368\u0368\u0368\u0368!!!", "!\253\256\256]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368!!!" + "'", str2, "\u0368\u0368\u0368\u0368!!!");
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!!!", "LL!!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!", "\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!");
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!" + "'", str2, "UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0223\200\200\u0223\200\200\u0223\200\200\u0223\200\200\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226\u0223\200\200\u0223\200\200\u0223\200\200\u0223\200\200\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226!", "\275``NNNNNNNN``NNNNNNNN``NNNNNNNN\276``NNNNNNNN\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!!" + "'", str2, "UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!UNLL!!!!!!!!");
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!\260EF!!EF!!EF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u014e\u014e!!\213\213\213\u0346\u0348\u0348!", "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368LL!!\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368LL!!\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNN!", "!!\214\214!!\214\214!!!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!!!\214\214!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\215\216\220\220\215\216\220\220\215\216\220\220\276\215\216\220\220\275\275!", "\215}\215\215\215}\215\215ULLLULLLULLLULLL\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\215\216\220\220\215\216\220\220\215\216\220\220\276\215\216\220\220\275\275!" + "'", str2, "\275\215\216\220\220\215\216\220\220\215\216\220\220\276\215\216\220\220\275\275!");
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUU!", "L\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!" + "'", str2, "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\260\u0108\u0108\260\260\u0108\u0108}}\260\260\u0108\u0108\260\260\u0108\u0108}}!", "\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012a\u012anullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260NN\260\260NN}}\260\260NN\260\260NN}}!" + "'", str2, "\260\260NN\260\260NN}}\260\260NN\260\260NN}}!");
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLL!LLL!LLL!LLL!LLLULLL!LLL!LLL!", "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NUUU!UUU!UUU!UUU!UUUNUUU!UUU!UUU!" + "'", str2, "NUUU!UUU!UUU!UUU!UUUNUUU!UUU!UUU!");
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "nullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330!" + "'", str2, "\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330!");
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLNNLLNNLLNNNLLNNLLNNLLNNNLLNNLLNNLLNNNLLNNLLNNLLNN\200}}`NLLNNLLNNLLNNNLLNNLLNNLLNNNLLNNLLNNLLNNNLLNNLLNNLLNN]]!", "\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\200}}`\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336]]!" + "'", str2, "\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\200}}`\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336\336\300\300\336\336\300\300\336\336\300\300\336\336]]!");
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!", "N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!" + "'", str2, "\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!");
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276!", "\215}\215\215\215}\215\215L\270\270\270L\270\270\270L\270\270\270L\270\270\270\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276!" + "'", str2, "nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276!");
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!", "\u0259\u0259\u0256\u0256\u0256\u0256\u0259\u0259!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!" + "'", str2, "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!", "vvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!" + "'", str2, "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!", "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!" + "'", str2, "!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!!~!\200\200~!\200\200!!!!!!!!~!\200\200~!\200\200!!!!!!!!!");
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!" + "'", str2, "!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!");
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e!", "\u0150\u0150!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLL!!!", "^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!!" + "'", str2, "\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!!");
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~HH!~HH!!!~HH!~HH!!!~HH!~HH!~HH!~HH!!!~HH!~HH!!!~HH!~HH!", "L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!" + "'", str2, "!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!");
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244!!!", "\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010enullnull!!!" + "'", str2, "\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010enullnull!!!");
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170!", "wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "FFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\276\276\300\300\276\276}}\300\300\276\276\300\300\276\276}}!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\276\276nullnull\276\276}}nullnull\276\276nullnull\276\276}}!" + "'", str2, "nullnull\276\276nullnull\276\276}}nullnull\276\276nullnull\276\276}}!");
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\u0346\u0348\u0348!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226!!LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226!!LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226!!LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226!!LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226!!LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226!!LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226\204\204LLLLLLLL\226\226LLLLLLLL\226\226LLLLLLLL\226\226\u0346\u0348\u0348!");
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!!", "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!" + "'", str2, "!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!\216\254\254!L!!\216\254\254!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!");
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0143\u0145\u0145\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0143\u0145\u0145\u0145\u0143\u0145\u0143!!!", "U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UUU!!!U!!!U!!!U!!!!!UUU!!!U!!!!" + "'", str2, "!!UUU!!!U!!!U!!!U!!!!!UUU!!!U!!!!");
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLL!", "TnullnullnullTnullnullnull!!!!TnullnullnullTnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLL!" + "'", str2, "LLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FF!!FF!!!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!!" + "'", str2, "UU!!UU!!!");
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "\u0366\u0365\u0368\u0368\215\215!!\215\215!!\215\215!!\215\215!!\213\213\213\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull!" + "'", str2, "\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull\215\213!!\215\213!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull\276``nullnullnullnullnullnullnullnull\275\275!", "!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!!!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!nullnullnull\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\276\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\275\275!" + "'", str2, "\275\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\276\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\275\275!");
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLL!LLL!LLL!LLL!LLL!", "~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!" + "'", str2, "]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!");
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull]!]]]!]]]!]]nullnullnullnull]!]]]!]]]!]]!", "!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!!\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL\230\226LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\230LL\226\230LL\226\230LL\226\230LL]!]]]!]]]!]]\226\230LL\226\230LL\226\230LL\226\230LL]!]]]!]]]!]]!" + "'", str2, "\226\230LL\226\230LL\226\230LL\226\230LL]!]]]!]]]!]]\226\230LL\226\230LL\226\230LL\226\230LL]!]]]!]]]!]]!");
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0nullnull!", "Le!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!ll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!" + "'", str2, "E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!");
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!" + "'", str2, "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!");
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!!\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!!nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!!nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!!nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!!nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!" + "'", str2, "nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!!nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!!nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!!nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!!nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230nullnullnullnullnullnullnullnull\216\225\230\230\216\225\230\230!");
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!", "!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VV\275\275VV\275\275!!VV\275\275VV\275\275!!VV\275\275VV\275\275VV\275\275VV\275\275!!VV\275\275VV\275\275!!VV\275\275VV\275\275!" + "'", str2, "VV\275\275VV\275\275!!VV\275\275VV\275\275!!VV\275\275VV\275\275VV\275\275VV\275\275!!VV\275\275VV\275\275!!VV\275\275VV\275\275!");
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e!", "!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!", "r!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurrr!ruurr!ruur!ruurrr!ruurr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRUU!!UU!!RRUU!!UU!!RRUU!!UU!!RRUU!!UU!!RRUU!!UU!!RRUU!!UU!!RRUU!!UU!!RRUU!!UU!!!" + "'", str2, "RRUU!!UU!!RRUU!!UU!!RRUU!!UU!!RRUU!!UU!!RRUU!!UU!!RRUU!!UU!!RRUU!!UU!!RRUU!!UU!!!");
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!", "\u0366\u0365\u0368\u0368ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!!ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!" + "'", str2, "LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!");
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\204LLL\204LLL\204LLL\204LLLLLLLLLLLLLLLLLLL\204LLL\204LLL\204LLL\204LLLLLLLLLL!", "LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014a\204\u014a\u014a\u014a\204\u014a\u014a\u014a\204\u014a\u014a\u014a\204\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\204\u014a\u014a\u014a\204\u014a\u014a\u014a\204\u014a\u014a\u014a\204\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!" + "'", str2, "\u014a\204\u014a\u014a\u014a\204\u014a\u014a\u014a\204\u014a\u014a\u014a\204\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\204\u014a\u014a\u014a\204\u014a\u014a\u014a\204\u014a\u014a\u014a\204\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!");
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!", "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!" + "'", str2, "!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8RR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnullRR~~RR~~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!" + "'", str2, "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!");
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!!!!", "^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!^```!!!^```!!!^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!!" + "'", str2, "^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!^```!!!^```!!!^```^```!!^```^```!!^```^```!!^```^```!!^```!!!^```!!!!");
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360!", "nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUUULUUU\254\254LUUULUUU\254\254]]LUUULUUU\254\254LUUULUUU\254\254]]\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254]]LUUULUUU\254\254LUUULUUU\254\254]]\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254!", "UULLUULLLLUULLUULLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!!!U!!!\254\254U!!!U!!!\254\254]]U!!!U!!!\254\254U!!!U!!!\254\254]]\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254]]U!!!U!!!\254\254U!!!U!!!\254\254]]\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254!" + "'", str2, "U!!!U!!!\254\254U!!!U!!!\254\254]]U!!!U!!!\254\254U!!!U!!!\254\254]]\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254]]U!!!U!!!\254\254U!!!U!!!\254\254]]\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254!");
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!", "\u0128\u0126\u0126\u0108\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107nullll!" + "'", str2, "\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107\u0107nullll!");
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULL!" + "'", str2, "NULLNULLNULLNULLNULL!");
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBBnullnullBB!", "!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!!" + "'", str2, "]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!]L}}]L}}!!!");
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254\u016eUUU\256\254\254!!!", "\275NULLNULLNULL\276NULL\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!!" + "'", str2, "nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!nullPPP\256\254\254nullPPP\256\254\254!!!");
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204!", "\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!");
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!", "null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!" + "'", str2, "\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!");
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\u0366\u0366nullnull\200\200\u0366\u0366nullnull\200\200\u0366\u0366nullnull\200\200\276\u0366\u0366nullnull\200\200\275\275!", "}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0366\u0366nullnullnullnullnullnullnullnull\200\200\u0366\u0366nullnullnullnullnullnullnullnull\200\200\u0366\u0366nullnullnullnullnullnullnullnull\200\200\276\u0366\u0366nullnullnullnullnullnullnullnull\200\200\275\275!" + "'", str2, "\275\u0366\u0366nullnullnullnullnullnullnullnull\200\200\u0366\u0366nullnullnullnullnullnullnullnull\200\200\u0366\u0366nullnullnullnullnullnullnullnull\200\200\276\u0366\u0366nullnullnullnullnullnullnullnull\200\200\275\275!");
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ!" + "'", str2, "^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ^ZZZ!");
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULL!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253!" + "'", str2, "\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253\253\224\224\224\253\224\224\224\253\224\224\224\253\224\224\224\260\222\253\253\260\222\253\253\260\222\253\253!");
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!" + "'", str2, "\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!");
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8ULLLULLLULLLULLLULLLULLLULLLULLL!", "JILLJILLJILLJILLJILLJILLJILLJILL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8null```null```null```null```null```null```null```null```!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8null```null```null```null```null```null```null```null```!");
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253!", "``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~LL!~LL\220\220!~LL!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220!~LL!~LL\220\220!~LL!~LL\220\220!", "null!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~LL!~LL\220\220!~LL!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220!~LL!~LL\220\220!~LL!~LL\220\220!" + "'", str2, "!~LL!~LL\220\220!~LL!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220!~LL!~LL\220\220!~LL!~LL\220\220!");
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF!", "\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\u02fc\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU!" + "'", str2, "~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU!");
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!", "\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!" + "'", str2, "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!");
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!", "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!" + "'", str2, "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!", "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215UU!!UU!!UU!!UU!!\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215UU!!UU!!UU!!UU!!\215}\215\215\215}\215\215!");
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256\u016eU\256\256~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!", "!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull!null!!!null!!nullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!", "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]!", "porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!]]PRRRPRRR!!PRRRPRRR!!]]PRRRPRRR!!PRRRPRRR!!]]PRRRPRRR!!PRRRPRRR!!]]]PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!]]PRRRPRRR!!PRRRPRRR!!]]!" + "'", str2, "]PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!]]PRRRPRRR!!PRRRPRRR!!]]PRRRPRRR!!PRRRPRRR!!]]PRRRPRRR!!PRRRPRRR!!]]]PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!]]PRRRPRRR!!PRRRPRRR!!]]!");
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220!", "!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!NLLLNLLLNLLL!!NLLLNLLL!!NLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220!" + "'", str2, "nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220!");
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!", "NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~!", "nullnullLULLLULLLULLLULLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~!" + "'", str2, "\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~!");
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!", "\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!", "\u03ad!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!" + "'", str2, "\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!");
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!null!", "\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214!", "\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214!" + "'", str2, "`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214`^```^```^```^```^```^```^```^```^``````^``\214\214`^``````^``\214\214!");
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!", "UNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!!U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!!U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!!U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!!U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!" + "'", str2, "U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!!U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!!U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!!U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!!U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!");
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226\200\200\200\200\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL!", "UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355!" + "'", str2, "\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355\276!\355\355!");
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276!", "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276!" + "'", str2, "null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276!");
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnull!", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254!" + "'", str2, "nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254nullnull\254\254\256null\254\254\256null\254\254\256null\254\254!");
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!!", "\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!!" + "'", str2, "\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!\253\254\256\256````````````````````````\253\254\256\256````````````````````````!!!");
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUU!", "\210\210LLLLL\210\210LLLLL\210\210LLLLL\210\210LLLLL\200}}`\210\210LLLLL\210\210LLLLL\210\210LLLLL\210\210LLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "||nullnull||nullnull!" + "'", str2, "||nullnull||nullnull!");
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null~ssnull~ss!!null~ssnull~ss!!null~ssnull~ssnull~ssnull~ss!!null~ssnull~ss!!null~ssnull~ss!", "\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL~NN!LLL~NN!!!LLL~NN!LLL~NN!!!LLL~NN!LLL~NN!LLL~NN!LLL~NN!!!LLL~NN!LLL~NN!!!LLL~NN!LLL~NN!" + "'", str2, "!LLL~NN!LLL~NN!!!LLL~NN!LLL~NN!!!LLL~NN!LLL~NN!LLL~NN!LLL~NN!!!LLL~NN!LLL~NN!!!LLL~NN!LLL~NN!");
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "UUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUU\275UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!", "!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106!!!" + "'", str2, "\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106\u0103\u0106\u0106\u0106!!!");
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de!", "\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!", "\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356!", "unulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUU!" + "'", str2, "UU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUUUU!!UU!!UUUUUUUU!");
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnullee\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cdnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cd\u01d0\u01cd\u01cdnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274!", "\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274!" + "'", str2, "!\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274!");
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae!", "!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!!!!null}}]]nullnullnull}}]]nullnull!!null}}]]nullnullnull}}]]nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380\u037f\u0380\u0380\u0380!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!", "\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!", "~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!]]PRRRPRRR!!PRRRPRRR!!]]PRRRPRRR!!PRRRPRRR!!]]PRRRPRRR!!PRRRPRRR!!]]]PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!PRRRPRRR!!]]PRRRPRRR!!PRRRPRRR!!]]!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]!" + "'", str2, "]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]!");
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLL\275\275\275UNLL\275\275\275!!UNLL\275\275\275UNLL\275\275\275!!UNLL\275\275\275UNLL\275\275\275UNLL\275\275\275UNLL\275\275\275!!UNLL\275\275\275UNLL\275\275\275!!UNLL\275\275\275UNLL\275\275\275!" + "'", str2, "UNLL\275\275\275UNLL\275\275\275!!UNLL\275\275\275UNLL\275\275\275!!UNLL\275\275\275UNLL\275\275\275UNLL\275\275\275UNLL\275\275\275!!UNLL\275\275\275UNLL\275\275\275!!UNLL\275\275\275UNLL\275\275\275!");
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!!", "````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````````````````````````````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````````````````````````````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!!" + "'", str2, "``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!``~``````~````!!!");
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!!NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!!NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!!NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!!NULL\225\223\223\275\275\275NULL\225\223\223\275\275\275!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!" + "'", str2, "nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!!nullnullnullnull\225\223\223\275\275\275nullnullnullnull\225\223\223\275\275\275!");
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!" + "'", str2, "!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!");
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318!", "~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379~}\200\200~}\200\200\u0379\u0379\u0379\u0379!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318!" + "'", str2, "\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\u0315\u0316\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318\260\253\256\256\u0315\u0316\u0318\u0318\u0318\u0318!");
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "\253\254\256\256\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179\253\254\256\256\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179!" + "'", str2, "\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179!");
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!", "\210\210LLLLL\210\210LLLLL\210\210LLLLL\210\210LLLLL\200}}`\210\210LLLLL\210\210LLLLL\210\210LLLLL\210\210LLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!" + "'", str2, "!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!");
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e}~\200\200}~\200\200\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e!", "nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull}~\200\200}~\200\200!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!" + "'", str2, "}~\200\200}~\200\200!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull}~\200\200}~\200\200!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!UZLLnullnullnullUZLLnullnullnullUZLLnullnullnull!");
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLNNNLNNNLNNN!", "\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\367!nullnull\367!nullnull!", "}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\367!U\230\215\215U\230\215\215\367!U\230\215\215U\230\215\215!" + "'", str2, "\367!U\230\215\215U\230\215\215\367!U\230\215\215U\230\215\215!");
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!", "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!" + "'", str2, "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!");
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!", "!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NN!!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!" + "'", str2, "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!" + "'", str2, "!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!");
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240!", "\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250!", "]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250!" + "'", str2, "\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250!");
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!!", "LUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUULUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!!" + "'", str2, "UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!UU!!UU!!!!UU!!UU!!!!!!!");
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!", "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF~}\200\200~}\200\200FHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFFFHHH!FHHHFHHHFHHH!FHHHFHHHHHFFHHFF!", "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU!" + "'", str2, "~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU~}\200\200~}\200\200ULLL!ULLLULLLULLL!ULLLULLLLLUULLUUULLL!ULLLULLLULLL!ULLLULLLLLUULLUU!");
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214\u0117\u0117\u0117\u0117\u0117\u0117\u0117\u0117\214\214!", "~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230~}\200\200~}\200\200\214\214!!\214\214!!\230\230\214\214!!\214\214!!\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!", "!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!null}\200\200null}\200\200null}\200\200null}\200\200!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200}}\200\200}}\200\200}}\200\200\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\200\200}}\200\200}}\200\200}}\200\200\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!" + "'", str2, "\200\200}}\200\200}}\200\200}}\200\200\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\200\200}}\200\200}}\200\200}}\200\200\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368AA!!AA!!\200\200\u0346\u0348\u0348!", "\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\253\253!!\253\253!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\253\253!!\253\253!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~!", "!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~!" + "'", str2, "\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~!");
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!!\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!!\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!!\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!!\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276\230\226\256!LU!!LU!!\256!LU!!LU!!\236\276\276!", "\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!" + "'", str2, "\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!!\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276\230\226\256\u0298\u0296\u0298\u0296!!\256\u0298\u0296\u0298\u0296!!\236\276\276!");
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUU!", "\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAA!" + "'", str2, "UALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAA!");
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0346\u0348\u0348\u0348`\230\230\230\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!", "\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!", "\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198!!!!" + "'", str2, "\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198!!!!");
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010e\u0108\u0108\u010e\u010enullnull!!!", "\275``~~``~~``~~\276``~~\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!!" + "'", str2, "nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!nullnullnullnullnullnullnullnull\276!~~\276!~~nullnullnullnullnullnullnullnull\276!~~\276!~~!!!");
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145!!!!!\200\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0145!!!!!]]!", "h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufllh~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!\200}}`nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!]]!" + "'", str2, "nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!\200}}`nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!!nullnull!!!!!nullnull!!!!!]]!");
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "LLUU\253\253\253\200}}`LLUU\253\253\253]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!!" + "'", str2, "MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!MM!!!");
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128!", "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!" + "'", str2, "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!");
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!", "nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\237LLL\237LLL!" + "'", str2, "\237LLL\237LLL!");
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!", "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!", "U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!" + "'", str2, "!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]\200}}`!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]!]]]]]]]]]]]]]]!");
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!!null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256\366\367\371\371\366\367\371\371\366\367\371\371\366\367\371\371\253\254\256\256\366\367\371\371\366\367\371\371!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256null\367nullnullnull\367nullnullnull\367nullnullnull\367nullnull\253\254\256\256null\367nullnullnull\367nullnull!" + "'", str2, "\253\254\256\256null\367nullnullnull\367nullnullnull\367nullnullnull\367nullnull\253\254\256\256null\367nullnullnull\367nullnull!");
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215L!!!L!!!L!!!L!!!\215}\215\215\215}\215\215!", "\276\276\275\275\275\275\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215null!!!null!!!null!!!null!!!\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215null!!!null!!!null!!!null!!!\215}\215\215\215}\215\215!");
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228!", "\u0366\u0365\u0368\u0368\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179!", "`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!!`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull`!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200\276nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200\275\275!", "!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!!!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!!!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!!!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!!!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\276\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\275\275!" + "'", str2, "\275\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\276\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\u0366\u02d6\u02d6\u02d6\u02d6\230\230\u02d6\u02d6\u02d6\u02d6\230\230\200\200\275\275!");
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("R!~~R!~~R!~~R!~~R!~~R!~~R!~~R!~~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLR!~~R!~~R!~~R!~~R!~~R!~~R!~~R!~~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126ULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNL!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!" + "'", str2, "L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNL!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!" + "'", str2, "!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!");
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUU!", "nullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!" + "'", str2, "LLLLLLLL!");
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0226!", "!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!U!LLU!LL!", "rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!R!LLR!LL!" + "'", str2, "!!!R!LLR!LL!");
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!", "nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368nullnull\327\327!nullnull\327\327nullnull\327\327nullnull\327\327!nullnull\327\327nullnull\327\327\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!");
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!!U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!!U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!!U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!!U!NNU!NN!NNN!NNNU!NNU!NN!NNN!NNN!", "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126ULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316!!\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316!!\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316!!\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316!!\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316!" + "'", str2, "\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316!!\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316!!\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316!!\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316!!\356!\316\316\356!\316\316!\316\316\316!\316\316\316\356!\316\316\356!\316\316!\316\316\316!\316\316\316!");
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!!", "!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!!" + "'", str2, "X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!X!!!X!!!X!!!X!!!\256\254\254X!!!X!!!X!!!X!!!\256\254\254!!!");
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!", "efhhefhhefhhefhhefhhefhhefhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnullnullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnull!" + "'", str2, "nullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnullnullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnull!");
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!", "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02faN~LLN~LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!~~!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!~~!");
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!", "!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!" + "'", str2, "!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!");
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`!!!\200}}``!!!]]!", "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!\200}}``!!!]]!" + "'", str2, "`!!!\200}}``!!!]]!");
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH!", "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!", "null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!" + "'", str2, "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!");
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!", "\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330\326\325\330\330!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!!!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!!!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!!!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!!!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!~\216\u0346\u0368\u0368\216\u0346\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLUUULUUULUUULUUULLLLLUUULUUU!", "\u0366\u0365\u0368\u0368nullnull\277\277\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLJJJLJJJLJJJLJJJLLLLLJJJLJJJ!" + "'", str2, "LLLLLJJJLJJJLJJJLJJJLLLLLJJJLJJJ!");
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnull!", "!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!L\230NNL\230NNL\230NN!!L\230NNL\230NN!!L\230NNL\230NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101!" + "'", str2, "\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101\u0104\u0101\u0101!");
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "u`uu`UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]!``]!``!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!``]!``!" + "'", str2, "]!``]!``!");
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!", "nullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!", "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!" + "'", str2, "!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!");
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\200\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e]]!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNN!NNN!NNN!NNN!NNNNNNNNNNNNNNNNNNN!NNN!NNN!", "h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufllh~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFFFFFFFFFFFFFFF!FFF!FFF!FFF!FFFFFFFFFFFFFFFFFFF!FFF!FFF!" + "'", str2, "FFFFFFFFFFFFFFFF!FFF!FFF!FFF!FFFFFFFFFFFFFFFFFFF!FFF!FFF!");
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!!", "!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!lll!lllnullnull!lll!lllnullnull!lll!lll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!!" + "'", str2, "}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!!");
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0346\u0348\u0348!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!]]NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\253\253!!\253\253!!\200\200\u0346\u0348\u0348!", "!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\253\253!!\253\253!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\253\253!!\253\253!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!", "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!" + "'", str2, "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!U!LLU!LL!", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!L!LLL!LL!" + "'", str2, "!!!L!LLL!LL!");
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\u0104\u0104\u0104\u0104\u0104\u0104\276\u0104\u0104\275\275!", "!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``nullnull``nullnull``nullnull\276``nullnull\275\275!" + "'", str2, "\275``nullnull``nullnull``nullnull\276``nullnull\275\275!");
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!!RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!!RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!!RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!!RRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnullRRRR!nullnull!", "]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!" + "'", str2, "!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!");
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!", "\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!", "LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!LULLLULL!!LULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!");
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!!", "}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!", "HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\200\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e]]!", "null]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NLLLNLLNLLLNLLNLLLNLL\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NLLLNLLNLLLNLLNLLLNLL]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NLLLNLLNLLLNLLNLLLNLL\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NLLLNLLNLLLNLLNLLLNLL]]!");
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!", "LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!" + "'", str2, "!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!");
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac^^!", "~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^^^^]null^^]null^^]null^^]null^^^^^^]null^^]null^^!" + "'", str2, "^^^^]null^^]null^^]null^^]null^^^^^^]null^^]null^^!");
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!", "U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!");
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HH!", "\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aanullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa!" + "'", str2, "\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa!");
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0170\u0170\u0170\u0170nullnullnullnullnullnullnullnullnull!", "X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230\200}}`X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]!" + "'", str2, "]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]!");
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d!!!" + "'", str2, "\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d\u0180\u0180\u017d\u017d!!!");
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LL!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253uruuuruu\253\253uruuuruu\253\253uruuuruu\253\253uruuuruu\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253uruuuruu\253\253uruuuruu\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnull!", "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225\u0317\u031a\225N]]\225\u0317\u031a\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225\u0317\u031a\225N]]\225\u0317\u031a\225N]]\225N]]!" + "'", str2, "\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225\u0317\u031a\225N]]\225\u0317\u031a\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225\u0317\u031a\225N]]\225\u0317\u031a\225N]]\225N]]!");
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNL!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!", "!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!!!!!!]UU!]UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8nullnull!" + "'", str2, "\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8\u02b8nullnull!");
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`}nullnull`}nullnull`}nullnull`}nullnull`}nullnull!", "v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}LVUULVUU`}LVUULVUU`}LVUULVUU`}LVUULVUU`}LVUULVUU!" + "'", str2, "`}LVUULVUU`}LVUULVUU`}LVUULVUU`}LVUULVUU`}LVUULVUU!");
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNN!NNN!NNN!NNN!NNNNNNNNNNNNNNNNNNN!NNN!NNN!", "~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~~~~~~~~~!~~~!~~~!~~~!~~~~~~~~~~~~~~~~~~~!~~~!~~~!" + "'", str2, "~~~~~~~~~~~~~~~~!~~~!~~~!~~~!~~~~~~~~~~~~~~~~~~~!~~~!~~~!");
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!!" + "'", str2, "ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!ZZ!!!");
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!LUUULUUULUUULUUULUUULUUULUUULUUUUL!!LUUUUL!!UL!!UL!!LUUUUL!!UL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`!!!\200}}``!!!]]!", "\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!\200}}``!!!]]!" + "'", str2, "`!!!\200}}``!!!]]!");
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!", "\270\270\270\270\270\270\270\270!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250!", "]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250!" + "'", str2, "\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250!");
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLL\276LLLLLLL\276\276LLLLL\276\276LLLLL\276\276LLLLL\276\276LLLL\276LLLLLLL\276\276LLLLL\276\276!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276!" + "'", str2, "nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276!");
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0!", "]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!", "^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!" + "'", str2, "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348\u012e\u012d\u0130\u0130\u0348\u0348!", "\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("||nullnull||nullnull!", "!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "||!XXX!XXX||!XXX!XXX!" + "'", str2, "||!XXX!XXX||!XXX!XXX!");
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!\270\270\270!\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!", "!null!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN!", "EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```EFHHEFHHEFHHEFHH```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254\200FFF\200FFF\254\254\200FFF\200FFF\254\254\200FFF\200FFF\254\254\200FFF\200FFF\254\254\200FFF\200FFF\254\254\200FFF\200FFF\254\254\200FFF\200FFF\254\254\200FFF\200FFF!" + "'", str2, "\254\254\200FFF\200FFF\254\254\200FFF\200FFF\254\254\200FFF\200FFF\254\254\200FFF\200FFF\254\254\200FFF\200FFF\254\254\200FFF\200FFF\254\254\200FFF\200FFF\254\254\200FFF\200FFF!");
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!!", "\u0366\u0365\u0368\u0368\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!!!");
    }
}
