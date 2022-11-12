package ciphers.Caesar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{l!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`m!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{y!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`g!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("fg!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`m!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`n!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`y!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`q!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a{!" + "'", str2, "a{!");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("``!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{i!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{o!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("gh!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{h!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`g!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`p!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`o!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("no!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("vw!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("lm!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{v!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{j!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`e!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`l!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{b!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`g!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{u!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{y!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{z!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("uv!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{z!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("gh!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("kl!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`j!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{m!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`g!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ab!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ij!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`d!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{{!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("wx!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`k!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("``!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`k!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`u!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{m!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`n!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`m!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`t!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`a!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`k!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{w!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{v!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{p!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`p!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`z!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`t!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{r!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`q!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("cd!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{g!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`y!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`z!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("xy!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{g!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`n!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`d!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("q`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{x!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("``!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`f!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`w!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d{!" + "'", str2, "d{!");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{p!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{m!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("bc!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`c!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{v!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`c!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{a!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`v!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{r!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`u!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`z!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`w!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`w!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{w!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{q!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`z!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`z!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{q!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h`!" + "'", str2, "h`!");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`a!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{s!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`n!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`q!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`u!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("xy!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{m!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`u!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("no!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("``!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("uv!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("g{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`m!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`h!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`g!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("yz!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`d!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`v!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("op!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{r!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{u!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`g!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`i!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`h!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{y!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("yz!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`u!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`j!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{b!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{b!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{f!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`v!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("no!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("pq!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`u!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{j!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{a!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`s!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`n!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`l!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`a!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("wx!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{f!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{j!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("jk!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("pq!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{g!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ij!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ef!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`w!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`v!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{l!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{g!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{o!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`w!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{q!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`j!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`c!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{u!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{m!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`o!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("cd!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{t!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`z!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`l!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{u!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("vw!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`c!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("pq!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`y!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`y!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`o!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`y!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`q!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`a!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`j!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`w!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`a!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`o!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("st!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("``!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`q!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{z!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("lm!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{w!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`x!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d{!" + "'", str2, "d{!");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("mn!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{d!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{p!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("hi!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("lm!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("g`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h`!" + "'", str2, "h`!");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{v!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{j!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`i!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{y!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{h!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h`!" + "'", str2, "h`!");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`f!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`w!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("qr!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{p!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`e!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("yz!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{x!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`c!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`m!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ef!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("mn!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{u!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("op!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`a!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`c!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`k!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("yz!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{s!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("hi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`n!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("jk!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("yz!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`i!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("hi!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`q!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }
}

