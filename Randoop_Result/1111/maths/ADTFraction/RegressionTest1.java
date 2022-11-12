package maths.ADTFraction;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int15 = aDTFraction14.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction14);
        int int17 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float24 = aDTFraction23.value();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction20.plus(aDTFraction23);
        boolean boolean27 = aDTFraction23.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction29 = aDTFraction23.times((int) (byte) 100);
        java.lang.String str30 = aDTFraction23.toString();
        int int31 = aDTFraction23.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction23.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction34 = aDTFraction2.plus(aDTFraction33);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction43 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float44 = aDTFraction43.value();
        com.thealgorithms.maths.ADTFraction aDTFraction45 = aDTFraction40.plus(aDTFraction43);
        com.thealgorithms.maths.ADTFraction aDTFraction46 = aDTFraction37.times(aDTFraction43);
        com.thealgorithms.maths.ADTFraction aDTFraction49 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float50 = aDTFraction49.value();
        boolean boolean51 = aDTFraction43.equals((java.lang.Object) aDTFraction49);
        java.lang.String str52 = aDTFraction49.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction53 = aDTFraction34.plus(aDTFraction49);
        int int54 = aDTFraction34.denominator();
        float float55 = aDTFraction34.value();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-0.0f) + "'", float24 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(aDTFraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0/-1" + "'", str30, "0/-1");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertNotNull(aDTFraction34);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-0.0f) + "'", float44 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction45);
        org.junit.Assert.assertNotNull(aDTFraction46);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-0.0f) + "'", float50 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0/-1" + "'", str52, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + (-1.0f) + "'", float55 == (-1.0f));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int15 = aDTFraction14.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = new com.thealgorithms.maths.ADTFraction(100, (int) (short) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction2.plus(aDTFraction19);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction26 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction29 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction32 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float33 = aDTFraction32.value();
        com.thealgorithms.maths.ADTFraction aDTFraction34 = aDTFraction29.plus(aDTFraction32);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = aDTFraction26.times(aDTFraction32);
        int int36 = aDTFraction32.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction23.times(aDTFraction32);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction32.times(1);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = aDTFraction20.plus(aDTFraction32);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-0.0f) + "'", float33 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction34);
        org.junit.Assert.assertNotNull(aDTFraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertNotNull(aDTFraction40);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int15 = aDTFraction14.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction17 = aDTFraction2.reciprocal();
        int int18 = aDTFraction2.numerator();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertNotNull(aDTFraction17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int3 = aDTFraction2.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction4 = aDTFraction2.reciprocal();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(aDTFraction4);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        java.lang.String str3 = aDTFraction2.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction6 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction9 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float10 = aDTFraction9.value();
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction6.plus(aDTFraction9);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction17 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction20 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float21 = aDTFraction20.value();
        com.thealgorithms.maths.ADTFraction aDTFraction22 = aDTFraction17.plus(aDTFraction20);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = aDTFraction14.times(aDTFraction20);
        com.thealgorithms.maths.ADTFraction aDTFraction26 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int27 = aDTFraction26.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction28 = aDTFraction14.times(aDTFraction26);
        com.thealgorithms.maths.ADTFraction aDTFraction29 = aDTFraction11.times(aDTFraction28);
        com.thealgorithms.maths.ADTFraction aDTFraction32 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction38 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float39 = aDTFraction38.value();
        com.thealgorithms.maths.ADTFraction aDTFraction40 = aDTFraction35.plus(aDTFraction38);
        com.thealgorithms.maths.ADTFraction aDTFraction41 = aDTFraction32.times(aDTFraction38);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction29.times(aDTFraction32);
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction29.times((int) (short) 1);
        com.thealgorithms.maths.ADTFraction aDTFraction45 = aDTFraction2.times(aDTFraction29);
        com.thealgorithms.maths.ADTFraction aDTFraction48 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction51 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float52 = aDTFraction51.value();
        com.thealgorithms.maths.ADTFraction aDTFraction53 = aDTFraction48.plus(aDTFraction51);
        int int54 = aDTFraction48.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction56 = aDTFraction48.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction59 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction62 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float63 = aDTFraction62.value();
        com.thealgorithms.maths.ADTFraction aDTFraction64 = aDTFraction59.plus(aDTFraction62);
        int int65 = aDTFraction59.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction67 = aDTFraction59.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction70 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction73 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float74 = aDTFraction73.value();
        com.thealgorithms.maths.ADTFraction aDTFraction75 = aDTFraction70.plus(aDTFraction73);
        boolean boolean77 = aDTFraction73.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction79 = aDTFraction73.times((int) (byte) 100);
        float float80 = aDTFraction73.value();
        com.thealgorithms.maths.ADTFraction aDTFraction81 = aDTFraction59.plus(aDTFraction73);
        boolean boolean82 = aDTFraction48.equals((java.lang.Object) aDTFraction73);
        float float83 = aDTFraction48.value();
        com.thealgorithms.maths.ADTFraction aDTFraction84 = aDTFraction29.times(aDTFraction48);
        float float85 = aDTFraction29.value();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0/-1" + "'", str3, "0/-1");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-0.0f) + "'", float10 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-0.0f) + "'", float21 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction22);
        org.junit.Assert.assertNotNull(aDTFraction23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(aDTFraction28);
        org.junit.Assert.assertNotNull(aDTFraction29);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-0.0f) + "'", float39 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction40);
        org.junit.Assert.assertNotNull(aDTFraction41);
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertNotNull(aDTFraction44);
        org.junit.Assert.assertNotNull(aDTFraction45);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + (-0.0f) + "'", float52 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(aDTFraction56);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + (-0.0f) + "'", float63 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(aDTFraction67);
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + (-0.0f) + "'", float74 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(aDTFraction79);
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + (-0.0f) + "'", float80 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + float83 + "' != '" + (-0.0f) + "'", float83 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction84);
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + 0.0f + "'", float85 == 0.0f);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int15 = aDTFraction14.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction17 = aDTFraction2.reciprocal();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction26 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction29 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float30 = aDTFraction29.value();
        com.thealgorithms.maths.ADTFraction aDTFraction31 = aDTFraction26.plus(aDTFraction29);
        com.thealgorithms.maths.ADTFraction aDTFraction32 = aDTFraction23.times(aDTFraction29);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float36 = aDTFraction35.value();
        boolean boolean37 = aDTFraction29.equals((java.lang.Object) aDTFraction35);
        java.lang.String str38 = aDTFraction35.toString();
        java.lang.String str39 = aDTFraction35.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction42 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float43 = aDTFraction42.value();
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction35.times(aDTFraction42);
        com.thealgorithms.maths.ADTFraction aDTFraction47 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction50 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction53 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float54 = aDTFraction53.value();
        com.thealgorithms.maths.ADTFraction aDTFraction55 = aDTFraction50.plus(aDTFraction53);
        com.thealgorithms.maths.ADTFraction aDTFraction56 = aDTFraction47.times(aDTFraction53);
        com.thealgorithms.maths.ADTFraction aDTFraction59 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float60 = aDTFraction59.value();
        boolean boolean61 = aDTFraction53.equals((java.lang.Object) aDTFraction59);
        java.lang.String str62 = aDTFraction59.toString();
        java.lang.String str63 = aDTFraction59.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction65 = aDTFraction59.times((int) (short) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction66 = aDTFraction35.plus(aDTFraction65);
        com.thealgorithms.maths.ADTFraction aDTFraction67 = aDTFraction20.times(aDTFraction35);
        com.thealgorithms.maths.ADTFraction aDTFraction68 = aDTFraction17.plus(aDTFraction35);
        com.thealgorithms.maths.ADTFraction aDTFraction70 = aDTFraction68.times((int) ' ');
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertNotNull(aDTFraction17);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-0.0f) + "'", float30 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction31);
        org.junit.Assert.assertNotNull(aDTFraction32);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-0.0f) + "'", float36 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0/-1" + "'", str38, "0/-1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0/-1" + "'", str39, "0/-1");
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-0.0f) + "'", float43 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction44);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + (-0.0f) + "'", float54 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction55);
        org.junit.Assert.assertNotNull(aDTFraction56);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + (-0.0f) + "'", float60 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0/-1" + "'", str62, "0/-1");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0/-1" + "'", str63, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction65);
        org.junit.Assert.assertNotNull(aDTFraction66);
        org.junit.Assert.assertNotNull(aDTFraction67);
        org.junit.Assert.assertNotNull(aDTFraction68);
        org.junit.Assert.assertNotNull(aDTFraction70);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction5.times((int) (byte) 100);
        java.lang.String str12 = aDTFraction5.toString();
        int int13 = aDTFraction5.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction5.times((int) ' ');
        float float16 = aDTFraction5.value();
        float float17 = aDTFraction5.value();
        java.lang.String str18 = aDTFraction5.toString();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0/-1" + "'", str12, "0/-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-0.0f) + "'", float16 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.0f) + "'", float17 == (-0.0f));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0/-1" + "'", str18, "0/-1");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (short) 0, (int) (byte) -1);
        int int3 = aDTFraction2.denominator();
        float float4 = aDTFraction2.value();
        float float5 = aDTFraction2.value();
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float12 = aDTFraction11.value();
        com.thealgorithms.maths.ADTFraction aDTFraction13 = aDTFraction8.plus(aDTFraction11);
        int int14 = aDTFraction8.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction17 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction8.plus(aDTFraction17);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float25 = aDTFraction24.value();
        com.thealgorithms.maths.ADTFraction aDTFraction26 = aDTFraction21.plus(aDTFraction24);
        int int27 = aDTFraction21.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction28 = aDTFraction17.times(aDTFraction21);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction34 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float38 = aDTFraction37.value();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction34.plus(aDTFraction37);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = aDTFraction31.times(aDTFraction37);
        com.thealgorithms.maths.ADTFraction aDTFraction43 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float44 = aDTFraction43.value();
        boolean boolean45 = aDTFraction37.equals((java.lang.Object) aDTFraction43);
        com.thealgorithms.maths.ADTFraction aDTFraction48 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction51 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float52 = aDTFraction51.value();
        com.thealgorithms.maths.ADTFraction aDTFraction53 = aDTFraction48.plus(aDTFraction51);
        boolean boolean55 = aDTFraction48.equals((java.lang.Object) 10);
        boolean boolean56 = aDTFraction43.equals((java.lang.Object) aDTFraction48);
        boolean boolean57 = aDTFraction21.equals((java.lang.Object) boolean56);
        com.thealgorithms.maths.ADTFraction aDTFraction58 = aDTFraction2.times(aDTFraction21);
        com.thealgorithms.maths.ADTFraction aDTFraction61 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction64 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float65 = aDTFraction64.value();
        com.thealgorithms.maths.ADTFraction aDTFraction66 = aDTFraction61.plus(aDTFraction64);
        int int67 = aDTFraction61.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction70 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction71 = aDTFraction61.plus(aDTFraction70);
        boolean boolean72 = aDTFraction58.equals((java.lang.Object) aDTFraction61);
        float float73 = aDTFraction61.value();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-0.0f) + "'", float4 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-0.0f) + "'", float5 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.0f) + "'", float12 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-0.0f) + "'", float25 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(aDTFraction28);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-0.0f) + "'", float38 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertNotNull(aDTFraction40);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-0.0f) + "'", float44 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + (-0.0f) + "'", float52 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(aDTFraction58);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + (-0.0f) + "'", float65 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(aDTFraction71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + (-0.0f) + "'", float73 == (-0.0f));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float15 = aDTFraction14.value();
        boolean boolean16 = aDTFraction8.equals((java.lang.Object) aDTFraction14);
        java.lang.String str17 = aDTFraction14.toString();
        java.lang.String str18 = aDTFraction14.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float22 = aDTFraction21.value();
        com.thealgorithms.maths.ADTFraction aDTFraction23 = aDTFraction14.times(aDTFraction21);
        com.thealgorithms.maths.ADTFraction aDTFraction26 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction29 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction32 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float33 = aDTFraction32.value();
        com.thealgorithms.maths.ADTFraction aDTFraction34 = aDTFraction29.plus(aDTFraction32);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = aDTFraction26.times(aDTFraction32);
        com.thealgorithms.maths.ADTFraction aDTFraction38 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float39 = aDTFraction38.value();
        boolean boolean40 = aDTFraction32.equals((java.lang.Object) aDTFraction38);
        java.lang.String str41 = aDTFraction38.toString();
        java.lang.String str42 = aDTFraction38.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction38.times((int) (short) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction45 = aDTFraction14.plus(aDTFraction44);
        int int46 = aDTFraction14.denominator();
        java.lang.Class<?> wildcardClass47 = aDTFraction14.getClass();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.0f) + "'", float15 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0/-1" + "'", str17, "0/-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0/-1" + "'", str18, "0/-1");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-0.0f) + "'", float22 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction23);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-0.0f) + "'", float33 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction34);
        org.junit.Assert.assertNotNull(aDTFraction35);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-0.0f) + "'", float39 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0/-1" + "'", str41, "0/-1");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0/-1" + "'", str42, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction44);
        org.junit.Assert.assertNotNull(aDTFraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(10, (int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction3 = aDTFraction2.reciprocal();
        com.thealgorithms.maths.ADTFraction aDTFraction5 = aDTFraction3.times(100);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(100, (int) (short) 100);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction12 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction15 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float19 = aDTFraction18.value();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction15.plus(aDTFraction18);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = aDTFraction12.times(aDTFraction18);
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int25 = aDTFraction24.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction26 = aDTFraction12.times(aDTFraction24);
        int int27 = aDTFraction24.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction28 = aDTFraction8.times(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction34 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float35 = aDTFraction34.value();
        com.thealgorithms.maths.ADTFraction aDTFraction36 = aDTFraction31.plus(aDTFraction34);
        int int37 = aDTFraction31.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction31.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction41 = aDTFraction31.times(52);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction24.times(aDTFraction31);
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction31.times(52);
        org.junit.Assert.assertNotNull(aDTFraction3);
        org.junit.Assert.assertNotNull(aDTFraction5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.0f) + "'", float19 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertNotNull(aDTFraction21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(aDTFraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(aDTFraction28);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-0.0f) + "'", float35 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertNotNull(aDTFraction41);
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertNotNull(aDTFraction44);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int15 = aDTFraction14.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction17 = aDTFraction2.reciprocal();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float24 = aDTFraction23.value();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction20.plus(aDTFraction23);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction34 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float35 = aDTFraction34.value();
        com.thealgorithms.maths.ADTFraction aDTFraction36 = aDTFraction31.plus(aDTFraction34);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction28.times(aDTFraction34);
        com.thealgorithms.maths.ADTFraction aDTFraction38 = aDTFraction23.plus(aDTFraction37);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction2.times(aDTFraction38);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        java.lang.String str43 = aDTFraction42.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction46 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction49 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float50 = aDTFraction49.value();
        com.thealgorithms.maths.ADTFraction aDTFraction51 = aDTFraction46.plus(aDTFraction49);
        com.thealgorithms.maths.ADTFraction aDTFraction54 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction57 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction60 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float61 = aDTFraction60.value();
        com.thealgorithms.maths.ADTFraction aDTFraction62 = aDTFraction57.plus(aDTFraction60);
        com.thealgorithms.maths.ADTFraction aDTFraction63 = aDTFraction54.times(aDTFraction60);
        com.thealgorithms.maths.ADTFraction aDTFraction66 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int67 = aDTFraction66.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction68 = aDTFraction54.times(aDTFraction66);
        com.thealgorithms.maths.ADTFraction aDTFraction69 = aDTFraction51.times(aDTFraction68);
        com.thealgorithms.maths.ADTFraction aDTFraction72 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction75 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction78 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float79 = aDTFraction78.value();
        com.thealgorithms.maths.ADTFraction aDTFraction80 = aDTFraction75.plus(aDTFraction78);
        com.thealgorithms.maths.ADTFraction aDTFraction81 = aDTFraction72.times(aDTFraction78);
        com.thealgorithms.maths.ADTFraction aDTFraction82 = aDTFraction69.times(aDTFraction72);
        com.thealgorithms.maths.ADTFraction aDTFraction84 = aDTFraction69.times((int) (short) 1);
        com.thealgorithms.maths.ADTFraction aDTFraction85 = aDTFraction42.times(aDTFraction69);
        java.lang.String str86 = aDTFraction42.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction87 = aDTFraction2.times(aDTFraction42);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.ADTFraction aDTFraction88 = aDTFraction42.reciprocal();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Denominator cannot be 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertNotNull(aDTFraction17);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-0.0f) + "'", float24 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-0.0f) + "'", float35 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction36);
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertNotNull(aDTFraction38);
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0/-1" + "'", str43, "0/-1");
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-0.0f) + "'", float50 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction51);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-0.0f) + "'", float61 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction62);
        org.junit.Assert.assertNotNull(aDTFraction63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertNotNull(aDTFraction68);
        org.junit.Assert.assertNotNull(aDTFraction69);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + (-0.0f) + "'", float79 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction80);
        org.junit.Assert.assertNotNull(aDTFraction81);
        org.junit.Assert.assertNotNull(aDTFraction82);
        org.junit.Assert.assertNotNull(aDTFraction84);
        org.junit.Assert.assertNotNull(aDTFraction85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "0/-1" + "'", str86, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction87);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float15 = aDTFraction14.value();
        boolean boolean16 = aDTFraction8.equals((java.lang.Object) aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float26 = aDTFraction25.value();
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction22.plus(aDTFraction25);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = aDTFraction19.times(aDTFraction25);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int32 = aDTFraction31.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction19.times(aDTFraction31);
        int int34 = aDTFraction19.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float41 = aDTFraction40.value();
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction37.plus(aDTFraction40);
        boolean boolean44 = aDTFraction40.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction46 = aDTFraction40.times((int) (byte) 100);
        java.lang.String str47 = aDTFraction40.toString();
        int int48 = aDTFraction40.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction50 = aDTFraction40.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction51 = aDTFraction19.plus(aDTFraction50);
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction14.plus(aDTFraction50);
        java.lang.String str53 = aDTFraction50.toString();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.0f) + "'", float15 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-0.0f) + "'", float26 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction27);
        org.junit.Assert.assertNotNull(aDTFraction28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-0.0f) + "'", float41 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(aDTFraction46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0/-1" + "'", str47, "0/-1");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction50);
        org.junit.Assert.assertNotNull(aDTFraction51);
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0/-1" + "'", str53, "0/-1");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction5.times((int) (byte) 100);
        java.lang.String str12 = aDTFraction5.toString();
        int int13 = aDTFraction5.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float23 = aDTFraction22.value();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction19.plus(aDTFraction22);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction16.times(aDTFraction22);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int29 = aDTFraction28.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction30 = aDTFraction16.times(aDTFraction28);
        int int31 = aDTFraction16.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction34 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float38 = aDTFraction37.value();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction34.plus(aDTFraction37);
        boolean boolean41 = aDTFraction37.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction43 = aDTFraction37.times((int) (byte) 100);
        java.lang.String str44 = aDTFraction37.toString();
        int int45 = aDTFraction37.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction47 = aDTFraction37.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction48 = aDTFraction16.plus(aDTFraction47);
        int int49 = aDTFraction47.denominator();
        boolean boolean51 = aDTFraction47.equals((java.lang.Object) '4');
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction5.times(aDTFraction47);
        float float53 = aDTFraction5.value();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0/-1" + "'", str12, "0/-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-0.0f) + "'", float23 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(aDTFraction30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-0.0f) + "'", float38 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(aDTFraction43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0/-1" + "'", str44, "0/-1");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction47);
        org.junit.Assert.assertNotNull(aDTFraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + (-0.0f) + "'", float53 == (-0.0f));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (byte) 1, (int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        int int11 = aDTFraction5.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction5.plus(aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float22 = aDTFraction21.value();
        com.thealgorithms.maths.ADTFraction aDTFraction23 = aDTFraction18.plus(aDTFraction21);
        int int24 = aDTFraction18.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction14.times(aDTFraction18);
        int int26 = aDTFraction14.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction2.plus(aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.ADTFraction aDTFraction29 = aDTFraction27.times(aDTFraction28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"numerator\" because \"fraction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-0.0f) + "'", float22 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(aDTFraction27);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float17 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction13.plus(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = aDTFraction10.times(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int23 = aDTFraction22.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction10.times(aDTFraction22);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction7.times(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float32 = aDTFraction31.value();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction28.plus(aDTFraction31);
        boolean boolean35 = aDTFraction31.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction31.times((int) (byte) 100);
        java.lang.String str38 = aDTFraction31.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction7.times(aDTFraction31);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float43 = aDTFraction42.value();
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction39.times(aDTFraction42);
        int int45 = aDTFraction42.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction48 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction51 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction54 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float55 = aDTFraction54.value();
        com.thealgorithms.maths.ADTFraction aDTFraction56 = aDTFraction51.plus(aDTFraction54);
        com.thealgorithms.maths.ADTFraction aDTFraction57 = aDTFraction48.times(aDTFraction54);
        com.thealgorithms.maths.ADTFraction aDTFraction60 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int61 = aDTFraction60.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction62 = aDTFraction48.times(aDTFraction60);
        com.thealgorithms.maths.ADTFraction aDTFraction63 = aDTFraction48.reciprocal();
        int int64 = aDTFraction63.numerator();
        boolean boolean65 = aDTFraction42.equals((java.lang.Object) int64);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.0f) + "'", float17 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertNotNull(aDTFraction19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-0.0f) + "'", float32 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0/-1" + "'", str38, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-0.0f) + "'", float43 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + (-0.0f) + "'", float55 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction56);
        org.junit.Assert.assertNotNull(aDTFraction57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertNotNull(aDTFraction62);
        org.junit.Assert.assertNotNull(aDTFraction63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        int int8 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction2.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float17 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction13.plus(aDTFraction16);
        int int19 = aDTFraction13.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction21 = aDTFraction13.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction27 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float28 = aDTFraction27.value();
        com.thealgorithms.maths.ADTFraction aDTFraction29 = aDTFraction24.plus(aDTFraction27);
        boolean boolean31 = aDTFraction27.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction27.times((int) (byte) 100);
        float float34 = aDTFraction27.value();
        com.thealgorithms.maths.ADTFraction aDTFraction35 = aDTFraction13.plus(aDTFraction27);
        boolean boolean36 = aDTFraction2.equals((java.lang.Object) aDTFraction27);
        java.lang.Object obj37 = null;
        boolean boolean38 = aDTFraction27.equals(obj37);
        com.thealgorithms.maths.ADTFraction aDTFraction41 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction44 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float45 = aDTFraction44.value();
        com.thealgorithms.maths.ADTFraction aDTFraction46 = aDTFraction41.plus(aDTFraction44);
        com.thealgorithms.maths.ADTFraction aDTFraction48 = aDTFraction44.times((int) 'a');
        boolean boolean49 = aDTFraction27.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.0f) + "'", float17 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(aDTFraction21);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-0.0f) + "'", float28 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-0.0f) + "'", float34 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-0.0f) + "'", float45 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction46);
        org.junit.Assert.assertNotNull(aDTFraction48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(35, (int) (short) 10);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(10, (int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction3 = aDTFraction2.reciprocal();
        int int4 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction5 = aDTFraction2.reciprocal();
        org.junit.Assert.assertNotNull(aDTFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(aDTFraction5);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        java.lang.String str3 = aDTFraction2.toString();
        int int4 = aDTFraction2.denominator();
        float float5 = aDTFraction2.value();
        float float6 = aDTFraction2.value();
        com.thealgorithms.maths.ADTFraction aDTFraction8 = aDTFraction2.times(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1/1" + "'", str3, "-1/1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertNotNull(aDTFraction8);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float17 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction13.plus(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = aDTFraction10.times(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction5.plus(aDTFraction19);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction26 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float27 = aDTFraction26.value();
        com.thealgorithms.maths.ADTFraction aDTFraction28 = aDTFraction23.plus(aDTFraction26);
        int int29 = aDTFraction23.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction31 = aDTFraction23.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction34 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float38 = aDTFraction37.value();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction34.plus(aDTFraction37);
        boolean boolean41 = aDTFraction37.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction43 = aDTFraction37.times((int) (byte) 100);
        float float44 = aDTFraction37.value();
        com.thealgorithms.maths.ADTFraction aDTFraction45 = aDTFraction23.plus(aDTFraction37);
        java.lang.String str46 = aDTFraction23.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction47 = aDTFraction20.times(aDTFraction23);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.0f) + "'", float17 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertNotNull(aDTFraction19);
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-0.0f) + "'", float27 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(aDTFraction31);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-0.0f) + "'", float38 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(aDTFraction43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-0.0f) + "'", float44 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0/-1" + "'", str46, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction47);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        int int12 = aDTFraction8.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float19 = aDTFraction18.value();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction15.plus(aDTFraction18);
        java.lang.String str21 = aDTFraction15.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction22 = aDTFraction8.plus(aDTFraction15);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction34 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float35 = aDTFraction34.value();
        com.thealgorithms.maths.ADTFraction aDTFraction36 = aDTFraction31.plus(aDTFraction34);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction28.times(aDTFraction34);
        int int38 = aDTFraction34.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction25.times(aDTFraction34);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = aDTFraction8.times(aDTFraction25);
        java.lang.String str41 = aDTFraction8.toString();
        float float42 = aDTFraction8.value();
        int int43 = aDTFraction8.denominator();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.0f) + "'", float19 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0/-1" + "'", str21, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction22);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-0.0f) + "'", float35 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction36);
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertNotNull(aDTFraction40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0/-1" + "'", str41, "0/-1");
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-0.0f) + "'", float42 == (-0.0f));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int15 = aDTFraction14.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction14);
        int int17 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float24 = aDTFraction23.value();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction20.plus(aDTFraction23);
        boolean boolean27 = aDTFraction23.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction29 = aDTFraction23.times((int) (byte) 100);
        java.lang.String str30 = aDTFraction23.toString();
        int int31 = aDTFraction23.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction23.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction34 = aDTFraction2.plus(aDTFraction33);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction43 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float44 = aDTFraction43.value();
        com.thealgorithms.maths.ADTFraction aDTFraction45 = aDTFraction40.plus(aDTFraction43);
        com.thealgorithms.maths.ADTFraction aDTFraction46 = aDTFraction37.times(aDTFraction43);
        com.thealgorithms.maths.ADTFraction aDTFraction49 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float50 = aDTFraction49.value();
        boolean boolean51 = aDTFraction43.equals((java.lang.Object) aDTFraction49);
        java.lang.String str52 = aDTFraction49.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction53 = aDTFraction34.plus(aDTFraction49);
        java.lang.Class<?> wildcardClass54 = aDTFraction34.getClass();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-0.0f) + "'", float24 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(aDTFraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0/-1" + "'", str30, "0/-1");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertNotNull(aDTFraction34);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-0.0f) + "'", float44 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction45);
        org.junit.Assert.assertNotNull(aDTFraction46);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-0.0f) + "'", float50 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0/-1" + "'", str52, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        int int8 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction12 = aDTFraction2.plus(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction15 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float19 = aDTFraction18.value();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction15.plus(aDTFraction18);
        int int21 = aDTFraction15.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction22 = aDTFraction11.times(aDTFraction15);
        float float23 = aDTFraction22.value();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction22.times((int) (short) 0);
        float float26 = aDTFraction25.value();
        java.lang.String str27 = aDTFraction25.toString();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(aDTFraction12);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.0f) + "'", float19 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(aDTFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0/1" + "'", str27, "0/1");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (short) -1, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        boolean boolean7 = aDTFraction5.equals((java.lang.Object) (-1));
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int11 = aDTFraction10.denominator();
        boolean boolean12 = aDTFraction5.equals((java.lang.Object) int11);
        boolean boolean13 = aDTFraction2.equals((java.lang.Object) int11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        com.thealgorithms.maths.ADTFraction aDTFraction4 = aDTFraction2.times(32);
        org.junit.Assert.assertNotNull(aDTFraction4);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        int int8 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction2.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float17 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction13.plus(aDTFraction16);
        boolean boolean20 = aDTFraction16.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction22 = aDTFraction16.times((int) (byte) 100);
        float float23 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction2.plus(aDTFraction16);
        float float25 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction34 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float35 = aDTFraction34.value();
        com.thealgorithms.maths.ADTFraction aDTFraction36 = aDTFraction31.plus(aDTFraction34);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction28.times(aDTFraction34);
        int int38 = aDTFraction28.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction41 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        boolean boolean43 = aDTFraction41.equals((java.lang.Object) (-1));
        com.thealgorithms.maths.ADTFraction aDTFraction46 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction49 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction52 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float53 = aDTFraction52.value();
        com.thealgorithms.maths.ADTFraction aDTFraction54 = aDTFraction49.plus(aDTFraction52);
        com.thealgorithms.maths.ADTFraction aDTFraction55 = aDTFraction46.times(aDTFraction52);
        int int56 = aDTFraction46.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction59 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction62 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction65 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float66 = aDTFraction65.value();
        com.thealgorithms.maths.ADTFraction aDTFraction67 = aDTFraction62.plus(aDTFraction65);
        com.thealgorithms.maths.ADTFraction aDTFraction68 = aDTFraction59.times(aDTFraction65);
        com.thealgorithms.maths.ADTFraction aDTFraction71 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float72 = aDTFraction71.value();
        boolean boolean73 = aDTFraction65.equals((java.lang.Object) aDTFraction71);
        java.lang.String str74 = aDTFraction71.toString();
        java.lang.String str75 = aDTFraction71.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction78 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float79 = aDTFraction78.value();
        com.thealgorithms.maths.ADTFraction aDTFraction80 = aDTFraction71.times(aDTFraction78);
        boolean boolean81 = aDTFraction46.equals((java.lang.Object) aDTFraction80);
        com.thealgorithms.maths.ADTFraction aDTFraction82 = aDTFraction41.times(aDTFraction46);
        com.thealgorithms.maths.ADTFraction aDTFraction83 = aDTFraction28.times(aDTFraction82);
        com.thealgorithms.maths.ADTFraction aDTFraction84 = aDTFraction16.times(aDTFraction82);
        com.thealgorithms.maths.ADTFraction aDTFraction86 = aDTFraction82.times((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.ADTFraction aDTFraction87 = aDTFraction82.reciprocal();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Denominator cannot be 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.0f) + "'", float17 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(aDTFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-0.0f) + "'", float23 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-0.0f) + "'", float25 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-0.0f) + "'", float35 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction36);
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + (-0.0f) + "'", float53 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction54);
        org.junit.Assert.assertNotNull(aDTFraction55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + (-0.0f) + "'", float66 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction67);
        org.junit.Assert.assertNotNull(aDTFraction68);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + (-0.0f) + "'", float72 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "0/-1" + "'", str74, "0/-1");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "0/-1" + "'", str75, "0/-1");
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + (-0.0f) + "'", float79 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(aDTFraction82);
        org.junit.Assert.assertNotNull(aDTFraction83);
        org.junit.Assert.assertNotNull(aDTFraction84);
        org.junit.Assert.assertNotNull(aDTFraction86);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float17 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction13.plus(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = aDTFraction10.times(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int23 = aDTFraction22.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction10.times(aDTFraction22);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction7.times(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float32 = aDTFraction31.value();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction28.plus(aDTFraction31);
        boolean boolean35 = aDTFraction31.equals((java.lang.Object) ' ');
        boolean boolean37 = aDTFraction31.equals((java.lang.Object) "");
        java.lang.String str38 = aDTFraction31.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction25.times(aDTFraction31);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        com.thealgorithms.maths.ADTFraction aDTFraction43 = aDTFraction25.times(aDTFraction42);
        int int44 = aDTFraction42.denominator();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.0f) + "'", float17 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertNotNull(aDTFraction19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-0.0f) + "'", float32 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0/-1" + "'", str38, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertNotNull(aDTFraction43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(100, (int) ' ');
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float12 = aDTFraction11.value();
        com.thealgorithms.maths.ADTFraction aDTFraction13 = aDTFraction8.plus(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = aDTFraction5.times(aDTFraction11);
        int int15 = aDTFraction11.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float23 = aDTFraction22.value();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction19.plus(aDTFraction22);
        java.lang.Class<?> wildcardClass25 = aDTFraction22.getClass();
        boolean boolean26 = aDTFraction2.equals((java.lang.Object) aDTFraction22);
        com.thealgorithms.maths.ADTFraction aDTFraction29 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction32 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float33 = aDTFraction32.value();
        com.thealgorithms.maths.ADTFraction aDTFraction34 = aDTFraction29.plus(aDTFraction32);
        boolean boolean36 = aDTFraction32.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction38 = aDTFraction32.times((int) (byte) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction22.times(aDTFraction38);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = new com.thealgorithms.maths.ADTFraction((int) '4', (int) '4');
        com.thealgorithms.maths.ADTFraction aDTFraction43 = aDTFraction38.plus(aDTFraction42);
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction43.reciprocal();
        int int45 = aDTFraction43.numerator();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.0f) + "'", float12 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction13);
        org.junit.Assert.assertNotNull(aDTFraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-0.0f) + "'", float23 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-0.0f) + "'", float33 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(aDTFraction38);
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertNotNull(aDTFraction43);
        org.junit.Assert.assertNotNull(aDTFraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-52) + "'", int45 == (-52));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) '4', (int) '4');
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction6 = aDTFraction2.plus(aDTFraction5);
        com.thealgorithms.maths.ADTFraction aDTFraction9 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float10 = aDTFraction9.value();
        java.lang.String str11 = aDTFraction9.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(100, (int) (short) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction9.plus(aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float22 = aDTFraction21.value();
        com.thealgorithms.maths.ADTFraction aDTFraction23 = aDTFraction18.plus(aDTFraction21);
        int int24 = aDTFraction18.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction26 = aDTFraction18.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction29 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction32 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float33 = aDTFraction32.value();
        com.thealgorithms.maths.ADTFraction aDTFraction34 = aDTFraction29.plus(aDTFraction32);
        boolean boolean36 = aDTFraction32.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction38 = aDTFraction32.times((int) (byte) 100);
        float float39 = aDTFraction32.value();
        com.thealgorithms.maths.ADTFraction aDTFraction40 = aDTFraction18.plus(aDTFraction32);
        int int41 = aDTFraction18.numerator();
        java.lang.String str42 = aDTFraction18.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction43 = aDTFraction15.plus(aDTFraction18);
        com.thealgorithms.maths.ADTFraction aDTFraction45 = aDTFraction18.times((int) ' ');
        boolean boolean46 = aDTFraction5.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction49 = new com.thealgorithms.maths.ADTFraction((int) (byte) 10, 1);
        com.thealgorithms.maths.ADTFraction aDTFraction50 = aDTFraction5.plus(aDTFraction49);
        org.junit.Assert.assertNotNull(aDTFraction6);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-0.0f) + "'", float10 == (-0.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0/-1" + "'", str11, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-0.0f) + "'", float22 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(aDTFraction26);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-0.0f) + "'", float33 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(aDTFraction38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-0.0f) + "'", float39 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0/-1" + "'", str42, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction43);
        org.junit.Assert.assertNotNull(aDTFraction45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(aDTFraction50);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (short) -1, (int) (byte) 10);
        boolean boolean4 = aDTFraction2.equals((java.lang.Object) 100.0d);
        com.thealgorithms.maths.ADTFraction aDTFraction7 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float14 = aDTFraction13.value();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction10.plus(aDTFraction13);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction7.times(aDTFraction13);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int20 = aDTFraction19.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction21 = aDTFraction7.times(aDTFraction19);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = aDTFraction7.reciprocal();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float29 = aDTFraction28.value();
        com.thealgorithms.maths.ADTFraction aDTFraction30 = aDTFraction25.plus(aDTFraction28);
        com.thealgorithms.maths.ADTFraction aDTFraction33 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction36 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float40 = aDTFraction39.value();
        com.thealgorithms.maths.ADTFraction aDTFraction41 = aDTFraction36.plus(aDTFraction39);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction33.times(aDTFraction39);
        com.thealgorithms.maths.ADTFraction aDTFraction43 = aDTFraction28.plus(aDTFraction42);
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction7.times(aDTFraction43);
        boolean boolean45 = aDTFraction2.equals((java.lang.Object) aDTFraction44);
        com.thealgorithms.maths.ADTFraction aDTFraction47 = aDTFraction44.times((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-0.0f) + "'", float14 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(aDTFraction21);
        org.junit.Assert.assertNotNull(aDTFraction22);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-0.0f) + "'", float29 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction30);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-0.0f) + "'", float40 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction41);
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertNotNull(aDTFraction43);
        org.junit.Assert.assertNotNull(aDTFraction44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(aDTFraction47);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        int int12 = aDTFraction8.numerator();
        java.lang.String str13 = aDTFraction8.toString();
        float float14 = aDTFraction8.value();
        java.lang.String str15 = aDTFraction8.toString();
        java.lang.Class<?> wildcardClass16 = aDTFraction8.getClass();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0/-1" + "'", str13, "0/-1");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-0.0f) + "'", float14 == (-0.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0/-1" + "'", str15, "0/-1");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) '4', (int) '4');
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction6 = aDTFraction2.plus(aDTFraction5);
        java.lang.String str7 = aDTFraction5.toString();
        org.junit.Assert.assertNotNull(aDTFraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1/1" + "'", str7, "-1/1");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float15 = aDTFraction14.value();
        boolean boolean16 = aDTFraction8.equals((java.lang.Object) aDTFraction14);
        java.lang.String str17 = aDTFraction14.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction19 = aDTFraction14.times((int) (short) -1);
        java.lang.Class<?> wildcardClass20 = aDTFraction19.getClass();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.0f) + "'", float15 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0/-1" + "'", str17, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (byte) 1, (int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        int int11 = aDTFraction5.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction5.plus(aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float22 = aDTFraction21.value();
        com.thealgorithms.maths.ADTFraction aDTFraction23 = aDTFraction18.plus(aDTFraction21);
        int int24 = aDTFraction18.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction14.times(aDTFraction18);
        int int26 = aDTFraction14.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction2.plus(aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.ADTFraction aDTFraction29 = aDTFraction14.times(aDTFraction28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"numerator\" because \"fraction\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-0.0f) + "'", float22 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(aDTFraction27);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float12 = aDTFraction11.value();
        com.thealgorithms.maths.ADTFraction aDTFraction13 = aDTFraction8.plus(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = aDTFraction5.times(aDTFraction11);
        int int15 = aDTFraction11.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction16.times(0);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction27 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction30 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float31 = aDTFraction30.value();
        com.thealgorithms.maths.ADTFraction aDTFraction32 = aDTFraction27.plus(aDTFraction30);
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction24.times(aDTFraction30);
        int int34 = aDTFraction30.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction35 = aDTFraction21.times(aDTFraction30);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction30.times(1);
        java.lang.String str38 = aDTFraction37.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction18.plus(aDTFraction37);
        int int40 = aDTFraction18.denominator();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.0f) + "'", float12 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction13);
        org.junit.Assert.assertNotNull(aDTFraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-0.0f) + "'", float31 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction32);
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(aDTFraction35);
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0/-1" + "'", str38, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float17 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction13.plus(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = aDTFraction10.times(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int23 = aDTFraction22.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction10.times(aDTFraction22);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction7.times(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float32 = aDTFraction31.value();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction28.plus(aDTFraction31);
        boolean boolean35 = aDTFraction31.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction31.times((int) (byte) 100);
        java.lang.String str38 = aDTFraction31.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction7.times(aDTFraction31);
        java.lang.String str40 = aDTFraction39.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction43 = new com.thealgorithms.maths.ADTFraction(10, (int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction43.reciprocal();
        com.thealgorithms.maths.ADTFraction aDTFraction46 = aDTFraction44.times(52);
        boolean boolean47 = aDTFraction39.equals((java.lang.Object) 52);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.0f) + "'", float17 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertNotNull(aDTFraction19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-0.0f) + "'", float32 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0/-1" + "'", str38, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0/-1" + "'", str40, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction44);
        org.junit.Assert.assertNotNull(aDTFraction46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        int int8 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction2.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float17 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction13.plus(aDTFraction16);
        boolean boolean20 = aDTFraction16.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction22 = aDTFraction16.times((int) (byte) 100);
        float float23 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction2.plus(aDTFraction16);
        float float25 = aDTFraction16.value();
        java.lang.String str26 = aDTFraction16.toString();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.0f) + "'", float17 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(aDTFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-0.0f) + "'", float23 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-0.0f) + "'", float25 == (-0.0f));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0/-1" + "'", str26, "0/-1");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) ' ');
        boolean boolean11 = aDTFraction5.equals((java.lang.Object) "");
        java.lang.String str12 = aDTFraction5.toString();
        int int13 = aDTFraction5.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float20 = aDTFraction19.value();
        com.thealgorithms.maths.ADTFraction aDTFraction21 = aDTFraction16.plus(aDTFraction19);
        boolean boolean23 = aDTFraction19.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction19.times((int) (byte) 100);
        java.lang.String str26 = aDTFraction19.toString();
        int int27 = aDTFraction19.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction29 = aDTFraction19.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction31 = aDTFraction19.times((int) (byte) 10);
        boolean boolean32 = aDTFraction5.equals((java.lang.Object) aDTFraction31);
        int int33 = aDTFraction31.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction35 = aDTFraction31.times((int) (byte) 1);
        int int36 = aDTFraction31.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction45 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float46 = aDTFraction45.value();
        com.thealgorithms.maths.ADTFraction aDTFraction47 = aDTFraction42.plus(aDTFraction45);
        com.thealgorithms.maths.ADTFraction aDTFraction48 = aDTFraction39.times(aDTFraction45);
        com.thealgorithms.maths.ADTFraction aDTFraction51 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float52 = aDTFraction51.value();
        boolean boolean53 = aDTFraction45.equals((java.lang.Object) aDTFraction51);
        java.lang.String str54 = aDTFraction51.toString();
        java.lang.String str55 = aDTFraction51.toString();
        float float56 = aDTFraction51.value();
        com.thealgorithms.maths.ADTFraction aDTFraction57 = aDTFraction31.plus(aDTFraction51);
        com.thealgorithms.maths.ADTFraction aDTFraction60 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction63 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction66 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float67 = aDTFraction66.value();
        com.thealgorithms.maths.ADTFraction aDTFraction68 = aDTFraction63.plus(aDTFraction66);
        com.thealgorithms.maths.ADTFraction aDTFraction69 = aDTFraction60.times(aDTFraction66);
        com.thealgorithms.maths.ADTFraction aDTFraction72 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float73 = aDTFraction72.value();
        boolean boolean74 = aDTFraction66.equals((java.lang.Object) aDTFraction72);
        java.lang.String str75 = aDTFraction72.toString();
        java.lang.String str76 = aDTFraction72.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction79 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float80 = aDTFraction79.value();
        com.thealgorithms.maths.ADTFraction aDTFraction81 = aDTFraction72.times(aDTFraction79);
        boolean boolean82 = aDTFraction51.equals((java.lang.Object) aDTFraction72);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0/-1" + "'", str12, "0/-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-0.0f) + "'", float20 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0/-1" + "'", str26, "0/-1");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction29);
        org.junit.Assert.assertNotNull(aDTFraction31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(aDTFraction35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-0.0f) + "'", float46 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction47);
        org.junit.Assert.assertNotNull(aDTFraction48);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + (-0.0f) + "'", float52 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0/-1" + "'", str54, "0/-1");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "0/-1" + "'", str55, "0/-1");
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + (-0.0f) + "'", float56 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction57);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + (-0.0f) + "'", float67 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction68);
        org.junit.Assert.assertNotNull(aDTFraction69);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + (-0.0f) + "'", float73 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "0/-1" + "'", str75, "0/-1");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "0/-1" + "'", str76, "0/-1");
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + (-0.0f) + "'", float80 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) ' ');
        boolean boolean11 = aDTFraction5.equals((java.lang.Object) "");
        java.lang.String str12 = aDTFraction5.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float19 = aDTFraction18.value();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction15.plus(aDTFraction18);
        int int21 = aDTFraction15.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction15.plus(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float32 = aDTFraction31.value();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction28.plus(aDTFraction31);
        int int34 = aDTFraction28.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction35 = aDTFraction24.times(aDTFraction28);
        float float36 = aDTFraction35.value();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction5.plus(aDTFraction35);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = new com.thealgorithms.maths.ADTFraction(10, (int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction41 = aDTFraction40.reciprocal();
        com.thealgorithms.maths.ADTFraction aDTFraction43 = aDTFraction41.times(52);
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction5.times(aDTFraction43);
        java.lang.String str45 = aDTFraction44.toString();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0/-1" + "'", str12, "0/-1");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.0f) + "'", float19 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-0.0f) + "'", float32 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(aDTFraction35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertNotNull(aDTFraction41);
        org.junit.Assert.assertNotNull(aDTFraction43);
        org.junit.Assert.assertNotNull(aDTFraction44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0/-10" + "'", str45, "0/-10");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float15 = aDTFraction14.value();
        boolean boolean16 = aDTFraction8.equals((java.lang.Object) aDTFraction14);
        java.lang.String str17 = aDTFraction14.toString();
        java.lang.String str18 = aDTFraction14.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float22 = aDTFraction21.value();
        com.thealgorithms.maths.ADTFraction aDTFraction23 = aDTFraction14.times(aDTFraction21);
        java.lang.String str24 = aDTFraction14.toString();
        int int25 = aDTFraction14.numerator();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.ADTFraction aDTFraction26 = aDTFraction14.reciprocal();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Denominator cannot be 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.0f) + "'", float15 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0/-1" + "'", str17, "0/-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0/-1" + "'", str18, "0/-1");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-0.0f) + "'", float22 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0/-1" + "'", str24, "0/-1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(100, (int) (short) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction3 = aDTFraction2.reciprocal();
        int int4 = aDTFraction3.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float14 = aDTFraction13.value();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction10.plus(aDTFraction13);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction7.times(aDTFraction13);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int20 = aDTFraction19.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction21 = aDTFraction7.times(aDTFraction19);
        int int22 = aDTFraction7.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float29 = aDTFraction28.value();
        com.thealgorithms.maths.ADTFraction aDTFraction30 = aDTFraction25.plus(aDTFraction28);
        boolean boolean32 = aDTFraction28.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction34 = aDTFraction28.times((int) (byte) 100);
        java.lang.String str35 = aDTFraction28.toString();
        int int36 = aDTFraction28.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction38 = aDTFraction28.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction7.plus(aDTFraction38);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction45 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction48 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float49 = aDTFraction48.value();
        com.thealgorithms.maths.ADTFraction aDTFraction50 = aDTFraction45.plus(aDTFraction48);
        com.thealgorithms.maths.ADTFraction aDTFraction51 = aDTFraction42.times(aDTFraction48);
        com.thealgorithms.maths.ADTFraction aDTFraction54 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float55 = aDTFraction54.value();
        boolean boolean56 = aDTFraction48.equals((java.lang.Object) aDTFraction54);
        java.lang.String str57 = aDTFraction54.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction58 = aDTFraction39.plus(aDTFraction54);
        boolean boolean59 = aDTFraction3.equals((java.lang.Object) aDTFraction58);
        org.junit.Assert.assertNotNull(aDTFraction3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-0.0f) + "'", float14 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(aDTFraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-0.0f) + "'", float29 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(aDTFraction34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0/-1" + "'", str35, "0/-1");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction38);
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + (-0.0f) + "'", float49 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction50);
        org.junit.Assert.assertNotNull(aDTFraction51);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + (-0.0f) + "'", float55 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0/-1" + "'", str57, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int15 = aDTFraction14.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction14);
        int int17 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float24 = aDTFraction23.value();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction20.plus(aDTFraction23);
        boolean boolean27 = aDTFraction23.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction29 = aDTFraction23.times((int) (byte) 100);
        java.lang.String str30 = aDTFraction23.toString();
        int int31 = aDTFraction23.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction23.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction34 = aDTFraction2.plus(aDTFraction33);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = new com.thealgorithms.maths.ADTFraction(10, (int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction38 = aDTFraction37.reciprocal();
        com.thealgorithms.maths.ADTFraction aDTFraction40 = aDTFraction38.times(100);
        com.thealgorithms.maths.ADTFraction aDTFraction43 = new com.thealgorithms.maths.ADTFraction(100, (int) (short) 100);
        boolean boolean44 = aDTFraction40.equals((java.lang.Object) aDTFraction43);
        com.thealgorithms.maths.ADTFraction aDTFraction45 = aDTFraction34.plus(aDTFraction43);
        com.thealgorithms.maths.ADTFraction aDTFraction46 = aDTFraction43.reciprocal();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-0.0f) + "'", float24 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(aDTFraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0/-1" + "'", str30, "0/-1");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertNotNull(aDTFraction34);
        org.junit.Assert.assertNotNull(aDTFraction38);
        org.junit.Assert.assertNotNull(aDTFraction40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(aDTFraction45);
        org.junit.Assert.assertNotNull(aDTFraction46);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int3 = aDTFraction2.denominator();
        boolean boolean5 = aDTFraction2.equals((java.lang.Object) (short) 0);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction((int) '#', (int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction9 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction12 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction15 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float19 = aDTFraction18.value();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction15.plus(aDTFraction18);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = aDTFraction12.times(aDTFraction18);
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float25 = aDTFraction24.value();
        boolean boolean26 = aDTFraction18.equals((java.lang.Object) aDTFraction24);
        java.lang.String str27 = aDTFraction24.toString();
        java.lang.String str28 = aDTFraction24.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction30 = aDTFraction24.times((int) (short) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction33 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction36 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float40 = aDTFraction39.value();
        com.thealgorithms.maths.ADTFraction aDTFraction41 = aDTFraction36.plus(aDTFraction39);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction33.times(aDTFraction39);
        com.thealgorithms.maths.ADTFraction aDTFraction45 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int46 = aDTFraction45.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction47 = aDTFraction33.times(aDTFraction45);
        com.thealgorithms.maths.ADTFraction aDTFraction48 = aDTFraction33.reciprocal();
        int int49 = aDTFraction48.numerator();
        float float50 = aDTFraction48.value();
        com.thealgorithms.maths.ADTFraction aDTFraction51 = aDTFraction30.times(aDTFraction48);
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction2.times(aDTFraction48);
        java.lang.String str53 = aDTFraction48.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(aDTFraction9);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.0f) + "'", float19 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertNotNull(aDTFraction21);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-0.0f) + "'", float25 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0/-1" + "'", str27, "0/-1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0/-1" + "'", str28, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction30);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-0.0f) + "'", float40 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction41);
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(aDTFraction47);
        org.junit.Assert.assertNotNull(aDTFraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-1.0f) + "'", float50 == (-1.0f));
        org.junit.Assert.assertNotNull(aDTFraction51);
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1/-1" + "'", str53, "1/-1");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float12 = aDTFraction11.value();
        com.thealgorithms.maths.ADTFraction aDTFraction13 = aDTFraction8.plus(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = aDTFraction5.times(aDTFraction11);
        int int15 = aDTFraction11.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction11);
        int int17 = aDTFraction11.denominator();
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction11.reciprocal();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Denominator cannot be 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.0f) + "'", float12 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction13);
        org.junit.Assert.assertNotNull(aDTFraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (byte) -1, (-52));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        int int12 = aDTFraction8.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float19 = aDTFraction18.value();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction15.plus(aDTFraction18);
        java.lang.String str21 = aDTFraction15.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction22 = aDTFraction8.plus(aDTFraction15);
        float float23 = aDTFraction22.value();
        com.thealgorithms.maths.ADTFraction aDTFraction26 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction29 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float30 = aDTFraction29.value();
        com.thealgorithms.maths.ADTFraction aDTFraction31 = aDTFraction26.plus(aDTFraction29);
        int int32 = aDTFraction26.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction34 = aDTFraction26.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction37 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float41 = aDTFraction40.value();
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction37.plus(aDTFraction40);
        boolean boolean44 = aDTFraction40.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction46 = aDTFraction40.times((int) (byte) 100);
        float float47 = aDTFraction40.value();
        com.thealgorithms.maths.ADTFraction aDTFraction48 = aDTFraction26.plus(aDTFraction40);
        int int49 = aDTFraction26.numerator();
        java.lang.String str50 = aDTFraction26.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction51 = aDTFraction22.plus(aDTFraction26);
        java.lang.String str52 = aDTFraction51.toString();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.0f) + "'", float19 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0/-1" + "'", str21, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-0.0f) + "'", float30 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(aDTFraction34);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-0.0f) + "'", float41 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(aDTFraction46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-0.0f) + "'", float47 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0/-1" + "'", str50, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0/-1" + "'", str52, "0/-1");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(35, 10);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float3 = aDTFraction2.value();
        java.lang.String str4 = aDTFraction2.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = new com.thealgorithms.maths.ADTFraction(100, (int) (short) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = aDTFraction2.plus(aDTFraction7);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float15 = aDTFraction14.value();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction11.plus(aDTFraction14);
        int int17 = aDTFraction11.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction19 = aDTFraction11.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float26 = aDTFraction25.value();
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction22.plus(aDTFraction25);
        boolean boolean29 = aDTFraction25.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction31 = aDTFraction25.times((int) (byte) 100);
        float float32 = aDTFraction25.value();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction11.plus(aDTFraction25);
        int int34 = aDTFraction11.numerator();
        java.lang.String str35 = aDTFraction11.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction36 = aDTFraction8.plus(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction38 = aDTFraction11.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction41 = new com.thealgorithms.maths.ADTFraction(10, (int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction41.reciprocal();
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction42.times(100);
        com.thealgorithms.maths.ADTFraction aDTFraction47 = new com.thealgorithms.maths.ADTFraction(100, (int) (short) 100);
        boolean boolean48 = aDTFraction44.equals((java.lang.Object) aDTFraction47);
        com.thealgorithms.maths.ADTFraction aDTFraction51 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction54 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float55 = aDTFraction54.value();
        com.thealgorithms.maths.ADTFraction aDTFraction56 = aDTFraction51.plus(aDTFraction54);
        int int57 = aDTFraction51.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction58 = aDTFraction47.plus(aDTFraction51);
        com.thealgorithms.maths.ADTFraction aDTFraction59 = aDTFraction38.plus(aDTFraction47);
        float float60 = aDTFraction59.value();
        float float61 = aDTFraction59.value();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-0.0f) + "'", float3 == (-0.0f));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0/-1" + "'", str4, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction8);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.0f) + "'", float15 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(aDTFraction19);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-0.0f) + "'", float26 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(aDTFraction31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-0.0f) + "'", float32 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0/-1" + "'", str35, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction36);
        org.junit.Assert.assertNotNull(aDTFraction38);
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertNotNull(aDTFraction44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + (-0.0f) + "'", float55 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(aDTFraction58);
        org.junit.Assert.assertNotNull(aDTFraction59);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 1.0f + "'", float60 == 1.0f);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 1.0f + "'", float61 == 1.0f);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction17 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction20 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float24 = aDTFraction23.value();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction20.plus(aDTFraction23);
        com.thealgorithms.maths.ADTFraction aDTFraction26 = aDTFraction17.times(aDTFraction23);
        int int27 = aDTFraction23.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction28 = aDTFraction14.times(aDTFraction23);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction34 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float35 = aDTFraction34.value();
        com.thealgorithms.maths.ADTFraction aDTFraction36 = aDTFraction31.plus(aDTFraction34);
        java.lang.Class<?> wildcardClass37 = aDTFraction34.getClass();
        boolean boolean38 = aDTFraction14.equals((java.lang.Object) aDTFraction34);
        com.thealgorithms.maths.ADTFraction aDTFraction41 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction44 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float45 = aDTFraction44.value();
        com.thealgorithms.maths.ADTFraction aDTFraction46 = aDTFraction41.plus(aDTFraction44);
        boolean boolean48 = aDTFraction44.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction50 = aDTFraction44.times((int) (byte) 100);
        java.lang.String str51 = aDTFraction44.toString();
        int int52 = aDTFraction44.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction53 = aDTFraction34.plus(aDTFraction44);
        com.thealgorithms.maths.ADTFraction aDTFraction54 = aDTFraction2.times(aDTFraction53);
        com.thealgorithms.maths.ADTFraction aDTFraction57 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction60 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float61 = aDTFraction60.value();
        com.thealgorithms.maths.ADTFraction aDTFraction62 = aDTFraction57.plus(aDTFraction60);
        com.thealgorithms.maths.ADTFraction aDTFraction65 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction68 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction71 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float72 = aDTFraction71.value();
        com.thealgorithms.maths.ADTFraction aDTFraction73 = aDTFraction68.plus(aDTFraction71);
        com.thealgorithms.maths.ADTFraction aDTFraction74 = aDTFraction65.times(aDTFraction71);
        com.thealgorithms.maths.ADTFraction aDTFraction77 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int78 = aDTFraction77.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction79 = aDTFraction65.times(aDTFraction77);
        com.thealgorithms.maths.ADTFraction aDTFraction80 = aDTFraction62.times(aDTFraction79);
        com.thealgorithms.maths.ADTFraction aDTFraction81 = aDTFraction54.plus(aDTFraction62);
        java.lang.String str82 = aDTFraction62.toString();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-0.0f) + "'", float24 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertNotNull(aDTFraction26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(aDTFraction28);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-0.0f) + "'", float35 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-0.0f) + "'", float45 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(aDTFraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0/-1" + "'", str51, "0/-1");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction53);
        org.junit.Assert.assertNotNull(aDTFraction54);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-0.0f) + "'", float61 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction62);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + (-0.0f) + "'", float72 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction73);
        org.junit.Assert.assertNotNull(aDTFraction74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertNotNull(aDTFraction79);
        org.junit.Assert.assertNotNull(aDTFraction80);
        org.junit.Assert.assertNotNull(aDTFraction81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "0/1" + "'", str82, "0/1");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (byte) 0, (-1));
        boolean boolean4 = aDTFraction2.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        boolean boolean4 = aDTFraction2.equals((java.lang.Object) (-1));
        com.thealgorithms.maths.ADTFraction aDTFraction7 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float17 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction13.plus(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = aDTFraction10.times(aDTFraction16);
        int int20 = aDTFraction16.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction21 = aDTFraction7.times(aDTFraction16);
        int int22 = aDTFraction16.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        float float26 = aDTFraction25.value();
        com.thealgorithms.maths.ADTFraction aDTFraction29 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction32 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction38 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float39 = aDTFraction38.value();
        com.thealgorithms.maths.ADTFraction aDTFraction40 = aDTFraction35.plus(aDTFraction38);
        com.thealgorithms.maths.ADTFraction aDTFraction41 = aDTFraction32.times(aDTFraction38);
        int int42 = aDTFraction38.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction43 = aDTFraction29.times(aDTFraction38);
        com.thealgorithms.maths.ADTFraction aDTFraction45 = aDTFraction38.times((int) (byte) 0);
        int int46 = aDTFraction45.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction47 = aDTFraction25.times(aDTFraction45);
        com.thealgorithms.maths.ADTFraction aDTFraction48 = aDTFraction16.plus(aDTFraction45);
        com.thealgorithms.maths.ADTFraction aDTFraction49 = aDTFraction2.plus(aDTFraction16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.0f) + "'", float17 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertNotNull(aDTFraction19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(aDTFraction21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-0.0f) + "'", float39 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction40);
        org.junit.Assert.assertNotNull(aDTFraction41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(aDTFraction43);
        org.junit.Assert.assertNotNull(aDTFraction45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction47);
        org.junit.Assert.assertNotNull(aDTFraction48);
        org.junit.Assert.assertNotNull(aDTFraction49);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float3 = aDTFraction2.value();
        java.lang.String str4 = aDTFraction2.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = new com.thealgorithms.maths.ADTFraction(100, (int) (short) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = aDTFraction2.plus(aDTFraction7);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float15 = aDTFraction14.value();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction11.plus(aDTFraction14);
        int int17 = aDTFraction11.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction19 = aDTFraction11.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float26 = aDTFraction25.value();
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction22.plus(aDTFraction25);
        boolean boolean29 = aDTFraction25.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction31 = aDTFraction25.times((int) (byte) 100);
        float float32 = aDTFraction25.value();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction11.plus(aDTFraction25);
        int int34 = aDTFraction11.numerator();
        java.lang.String str35 = aDTFraction11.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction36 = aDTFraction8.plus(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction38 = aDTFraction11.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction41 = new com.thealgorithms.maths.ADTFraction(10, (int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction41.reciprocal();
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction42.times(100);
        com.thealgorithms.maths.ADTFraction aDTFraction47 = new com.thealgorithms.maths.ADTFraction(100, (int) (short) 100);
        boolean boolean48 = aDTFraction44.equals((java.lang.Object) aDTFraction47);
        com.thealgorithms.maths.ADTFraction aDTFraction51 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction54 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float55 = aDTFraction54.value();
        com.thealgorithms.maths.ADTFraction aDTFraction56 = aDTFraction51.plus(aDTFraction54);
        int int57 = aDTFraction51.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction58 = aDTFraction47.plus(aDTFraction51);
        com.thealgorithms.maths.ADTFraction aDTFraction59 = aDTFraction38.plus(aDTFraction47);
        java.lang.String str60 = aDTFraction59.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction63 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction66 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float67 = aDTFraction66.value();
        com.thealgorithms.maths.ADTFraction aDTFraction68 = aDTFraction63.plus(aDTFraction66);
        com.thealgorithms.maths.ADTFraction aDTFraction70 = aDTFraction66.times((int) 'a');
        float float71 = aDTFraction66.value();
        com.thealgorithms.maths.ADTFraction aDTFraction74 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction77 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float78 = aDTFraction77.value();
        com.thealgorithms.maths.ADTFraction aDTFraction79 = aDTFraction74.plus(aDTFraction77);
        com.thealgorithms.maths.ADTFraction aDTFraction80 = aDTFraction66.times(aDTFraction79);
        com.thealgorithms.maths.ADTFraction aDTFraction81 = aDTFraction59.times(aDTFraction80);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-0.0f) + "'", float3 == (-0.0f));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0/-1" + "'", str4, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction8);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.0f) + "'", float15 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(aDTFraction19);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-0.0f) + "'", float26 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(aDTFraction31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-0.0f) + "'", float32 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0/-1" + "'", str35, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction36);
        org.junit.Assert.assertNotNull(aDTFraction38);
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertNotNull(aDTFraction44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + (-0.0f) + "'", float55 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(aDTFraction58);
        org.junit.Assert.assertNotNull(aDTFraction59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "-100/-100" + "'", str60, "-100/-100");
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + (-0.0f) + "'", float67 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction68);
        org.junit.Assert.assertNotNull(aDTFraction70);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + (-0.0f) + "'", float71 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + (-0.0f) + "'", float78 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction79);
        org.junit.Assert.assertNotNull(aDTFraction80);
        org.junit.Assert.assertNotNull(aDTFraction81);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float15 = aDTFraction14.value();
        boolean boolean16 = aDTFraction8.equals((java.lang.Object) aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float23 = aDTFraction22.value();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction19.plus(aDTFraction22);
        boolean boolean26 = aDTFraction19.equals((java.lang.Object) 10);
        boolean boolean27 = aDTFraction14.equals((java.lang.Object) aDTFraction19);
        com.thealgorithms.maths.ADTFraction aDTFraction30 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction33 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction36 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float40 = aDTFraction39.value();
        com.thealgorithms.maths.ADTFraction aDTFraction41 = aDTFraction36.plus(aDTFraction39);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction33.times(aDTFraction39);
        int int43 = aDTFraction39.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction30.times(aDTFraction39);
        com.thealgorithms.maths.ADTFraction aDTFraction47 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction50 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float51 = aDTFraction50.value();
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction47.plus(aDTFraction50);
        java.lang.Class<?> wildcardClass53 = aDTFraction50.getClass();
        boolean boolean54 = aDTFraction30.equals((java.lang.Object) aDTFraction50);
        com.thealgorithms.maths.ADTFraction aDTFraction57 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction60 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float61 = aDTFraction60.value();
        com.thealgorithms.maths.ADTFraction aDTFraction62 = aDTFraction57.plus(aDTFraction60);
        boolean boolean64 = aDTFraction60.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction66 = aDTFraction60.times((int) (byte) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction67 = aDTFraction50.times(aDTFraction66);
        boolean boolean68 = aDTFraction19.equals((java.lang.Object) aDTFraction66);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.ADTFraction aDTFraction69 = aDTFraction66.reciprocal();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Denominator cannot be 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.0f) + "'", float15 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-0.0f) + "'", float23 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-0.0f) + "'", float40 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction41);
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(aDTFraction44);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-0.0f) + "'", float51 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-0.0f) + "'", float61 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(aDTFraction66);
        org.junit.Assert.assertNotNull(aDTFraction67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (short) -1, (int) (byte) 10);
        boolean boolean4 = aDTFraction2.equals((java.lang.Object) 100.0d);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = aDTFraction2.reciprocal();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(aDTFraction5);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float15 = aDTFraction14.value();
        boolean boolean16 = aDTFraction8.equals((java.lang.Object) aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float26 = aDTFraction25.value();
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction22.plus(aDTFraction25);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = aDTFraction19.times(aDTFraction25);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int32 = aDTFraction31.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction19.times(aDTFraction31);
        int int34 = aDTFraction19.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float41 = aDTFraction40.value();
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction37.plus(aDTFraction40);
        boolean boolean44 = aDTFraction40.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction46 = aDTFraction40.times((int) (byte) 100);
        java.lang.String str47 = aDTFraction40.toString();
        int int48 = aDTFraction40.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction50 = aDTFraction40.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction51 = aDTFraction19.plus(aDTFraction50);
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction14.plus(aDTFraction50);
        java.lang.Class<?> wildcardClass53 = aDTFraction14.getClass();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.0f) + "'", float15 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-0.0f) + "'", float26 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction27);
        org.junit.Assert.assertNotNull(aDTFraction28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-0.0f) + "'", float41 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(aDTFraction46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0/-1" + "'", str47, "0/-1");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction50);
        org.junit.Assert.assertNotNull(aDTFraction51);
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) ' ');
        boolean boolean11 = aDTFraction5.equals((java.lang.Object) "");
        float float12 = aDTFraction5.value();
        java.lang.String str13 = aDTFraction5.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float20 = aDTFraction19.value();
        com.thealgorithms.maths.ADTFraction aDTFraction21 = aDTFraction16.plus(aDTFraction19);
        boolean boolean23 = aDTFraction19.equals((java.lang.Object) ' ');
        boolean boolean25 = aDTFraction19.equals((java.lang.Object) "");
        float float26 = aDTFraction19.value();
        com.thealgorithms.maths.ADTFraction aDTFraction28 = aDTFraction19.times((int) (short) 0);
        com.thealgorithms.maths.ADTFraction aDTFraction29 = aDTFraction5.times(aDTFraction28);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = aDTFraction28.times((int) '#');
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.0f) + "'", float12 == (-0.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0/-1" + "'", str13, "0/-1");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-0.0f) + "'", float20 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-0.0f) + "'", float26 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction28);
        org.junit.Assert.assertNotNull(aDTFraction29);
        org.junit.Assert.assertNotNull(aDTFraction31);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        float float7 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float14 = aDTFraction13.value();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction10.plus(aDTFraction13);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float25 = aDTFraction24.value();
        com.thealgorithms.maths.ADTFraction aDTFraction26 = aDTFraction21.plus(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction18.times(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction30 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int31 = aDTFraction30.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction32 = aDTFraction18.times(aDTFraction30);
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction15.times(aDTFraction32);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = aDTFraction15.times(100);
        com.thealgorithms.maths.ADTFraction aDTFraction36 = aDTFraction5.times(aDTFraction15);
        com.thealgorithms.maths.ADTFraction aDTFraction38 = aDTFraction15.times((int) (short) 0);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction2.plus(aDTFraction15);
        float float40 = aDTFraction2.value();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-0.0f) + "'", float7 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-0.0f) + "'", float14 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-0.0f) + "'", float25 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction26);
        org.junit.Assert.assertNotNull(aDTFraction27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(aDTFraction32);
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertNotNull(aDTFraction35);
        org.junit.Assert.assertNotNull(aDTFraction36);
        org.junit.Assert.assertNotNull(aDTFraction38);
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float17 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction13.plus(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = aDTFraction10.times(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int23 = aDTFraction22.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction10.times(aDTFraction22);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction7.times(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float32 = aDTFraction31.value();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction28.plus(aDTFraction31);
        boolean boolean35 = aDTFraction31.equals((java.lang.Object) ' ');
        boolean boolean37 = aDTFraction31.equals((java.lang.Object) "");
        java.lang.String str38 = aDTFraction31.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction25.times(aDTFraction31);
        float float40 = aDTFraction39.value();
        java.lang.String str41 = aDTFraction39.toString();
        java.lang.String str42 = aDTFraction39.toString();
        float float43 = aDTFraction39.value();
        java.lang.Class<?> wildcardClass44 = aDTFraction39.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.0f) + "'", float17 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertNotNull(aDTFraction19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-0.0f) + "'", float32 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0/-1" + "'", str38, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-0.0f) + "'", float40 == (-0.0f));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0/-100" + "'", str41, "0/-100");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0/-100" + "'", str42, "0/-100");
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-0.0f) + "'", float43 == (-0.0f));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int15 = aDTFraction14.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction14);
        int int17 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float24 = aDTFraction23.value();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction20.plus(aDTFraction23);
        boolean boolean27 = aDTFraction23.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction29 = aDTFraction23.times((int) (byte) 100);
        java.lang.String str30 = aDTFraction23.toString();
        int int31 = aDTFraction23.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction23.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction34 = aDTFraction2.plus(aDTFraction33);
        int int35 = aDTFraction33.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction33.times((-52));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-0.0f) + "'", float24 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(aDTFraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0/-1" + "'", str30, "0/-1");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertNotNull(aDTFraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction37);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int15 = aDTFraction14.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction14);
        int int17 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float24 = aDTFraction23.value();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction20.plus(aDTFraction23);
        boolean boolean27 = aDTFraction23.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction29 = aDTFraction23.times((int) (byte) 100);
        java.lang.String str30 = aDTFraction23.toString();
        int int31 = aDTFraction23.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction23.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction34 = aDTFraction2.plus(aDTFraction33);
        int int35 = aDTFraction33.denominator();
        int int36 = aDTFraction33.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float43 = aDTFraction42.value();
        com.thealgorithms.maths.ADTFraction aDTFraction44 = aDTFraction39.plus(aDTFraction42);
        int int45 = aDTFraction39.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction48 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction49 = aDTFraction39.plus(aDTFraction48);
        com.thealgorithms.maths.ADTFraction aDTFraction50 = aDTFraction33.times(aDTFraction49);
        java.lang.String str51 = aDTFraction49.toString();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-0.0f) + "'", float24 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(aDTFraction29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0/-1" + "'", str30, "0/-1");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertNotNull(aDTFraction34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-0.0f) + "'", float43 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(aDTFraction49);
        org.junit.Assert.assertNotNull(aDTFraction50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0/1" + "'", str51, "0/1");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (byte) 1, (int) (short) 10);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) '4', (int) '4');
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction6 = aDTFraction2.plus(aDTFraction5);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = aDTFraction2.times((-100));
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction((int) (short) 0, (int) (byte) -1);
        int int12 = aDTFraction11.denominator();
        float float13 = aDTFraction11.value();
        float float14 = aDTFraction11.value();
        com.thealgorithms.maths.ADTFraction aDTFraction17 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction20 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float21 = aDTFraction20.value();
        com.thealgorithms.maths.ADTFraction aDTFraction22 = aDTFraction17.plus(aDTFraction20);
        boolean boolean24 = aDTFraction20.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction26 = aDTFraction20.times((int) (byte) 100);
        java.lang.String str27 = aDTFraction20.toString();
        int int28 = aDTFraction20.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction30 = aDTFraction20.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction33 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction36 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float40 = aDTFraction39.value();
        com.thealgorithms.maths.ADTFraction aDTFraction41 = aDTFraction36.plus(aDTFraction39);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction33.times(aDTFraction39);
        int int43 = aDTFraction39.numerator();
        int int44 = aDTFraction39.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction47 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction50 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float51 = aDTFraction50.value();
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction47.plus(aDTFraction50);
        boolean boolean54 = aDTFraction50.equals((java.lang.Object) ' ');
        boolean boolean56 = aDTFraction50.equals((java.lang.Object) "");
        float float57 = aDTFraction50.value();
        com.thealgorithms.maths.ADTFraction aDTFraction58 = aDTFraction39.times(aDTFraction50);
        boolean boolean59 = aDTFraction30.equals((java.lang.Object) aDTFraction39);
        com.thealgorithms.maths.ADTFraction aDTFraction62 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction65 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float66 = aDTFraction65.value();
        com.thealgorithms.maths.ADTFraction aDTFraction67 = aDTFraction62.plus(aDTFraction65);
        int int68 = aDTFraction62.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction71 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction72 = aDTFraction62.plus(aDTFraction71);
        com.thealgorithms.maths.ADTFraction aDTFraction75 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction78 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float79 = aDTFraction78.value();
        com.thealgorithms.maths.ADTFraction aDTFraction80 = aDTFraction75.plus(aDTFraction78);
        int int81 = aDTFraction75.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction82 = aDTFraction71.times(aDTFraction75);
        com.thealgorithms.maths.ADTFraction aDTFraction83 = aDTFraction30.plus(aDTFraction71);
        com.thealgorithms.maths.ADTFraction aDTFraction84 = aDTFraction11.plus(aDTFraction83);
        com.thealgorithms.maths.ADTFraction aDTFraction86 = aDTFraction84.times((int) (byte) 0);
        boolean boolean87 = aDTFraction2.equals((java.lang.Object) aDTFraction84);
        com.thealgorithms.maths.ADTFraction aDTFraction88 = aDTFraction2.reciprocal();
        org.junit.Assert.assertNotNull(aDTFraction6);
        org.junit.Assert.assertNotNull(aDTFraction8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-0.0f) + "'", float13 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-0.0f) + "'", float14 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-0.0f) + "'", float21 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(aDTFraction26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0/-1" + "'", str27, "0/-1");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction30);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-0.0f) + "'", float40 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction41);
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-0.0f) + "'", float51 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + (-0.0f) + "'", float57 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + (-0.0f) + "'", float66 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(aDTFraction72);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + (-0.0f) + "'", float79 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(aDTFraction82);
        org.junit.Assert.assertNotNull(aDTFraction83);
        org.junit.Assert.assertNotNull(aDTFraction84);
        org.junit.Assert.assertNotNull(aDTFraction86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(aDTFraction88);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float15 = aDTFraction14.value();
        boolean boolean16 = aDTFraction8.equals((java.lang.Object) aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float26 = aDTFraction25.value();
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction22.plus(aDTFraction25);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = aDTFraction19.times(aDTFraction25);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int32 = aDTFraction31.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction19.times(aDTFraction31);
        int int34 = aDTFraction19.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float41 = aDTFraction40.value();
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction37.plus(aDTFraction40);
        boolean boolean44 = aDTFraction40.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction46 = aDTFraction40.times((int) (byte) 100);
        java.lang.String str47 = aDTFraction40.toString();
        int int48 = aDTFraction40.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction50 = aDTFraction40.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction51 = aDTFraction19.plus(aDTFraction50);
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction14.plus(aDTFraction50);
        java.lang.Class<?> wildcardClass53 = aDTFraction52.getClass();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.0f) + "'", float15 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-0.0f) + "'", float26 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction27);
        org.junit.Assert.assertNotNull(aDTFraction28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-0.0f) + "'", float41 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(aDTFraction46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0/-1" + "'", str47, "0/-1");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction50);
        org.junit.Assert.assertNotNull(aDTFraction51);
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float12 = aDTFraction11.value();
        com.thealgorithms.maths.ADTFraction aDTFraction13 = aDTFraction8.plus(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = aDTFraction5.times(aDTFraction11);
        int int15 = aDTFraction11.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction11.times(1);
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction18.times((int) '#');
        int int21 = aDTFraction20.denominator();
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.0f) + "'", float12 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction13);
        org.junit.Assert.assertNotNull(aDTFraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float3 = aDTFraction2.value();
        java.lang.String str4 = aDTFraction2.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = new com.thealgorithms.maths.ADTFraction(100, (int) (short) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = aDTFraction2.plus(aDTFraction7);
        java.lang.String str9 = aDTFraction8.toString();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-0.0f) + "'", float3 == (-0.0f));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0/-1" + "'", str4, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-100/-100" + "'", str9, "-100/-100");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        int int8 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction12 = aDTFraction2.plus(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction15 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float19 = aDTFraction18.value();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction15.plus(aDTFraction18);
        int int21 = aDTFraction15.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction22 = aDTFraction11.times(aDTFraction15);
        float float23 = aDTFraction22.value();
        int int24 = aDTFraction22.numerator();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(aDTFraction12);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.0f) + "'", float19 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(aDTFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction5.times((int) (byte) 100);
        java.lang.String str12 = aDTFraction5.toString();
        int int13 = aDTFraction5.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction5.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float25 = aDTFraction24.value();
        com.thealgorithms.maths.ADTFraction aDTFraction26 = aDTFraction21.plus(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction18.times(aDTFraction24);
        int int28 = aDTFraction24.numerator();
        int int29 = aDTFraction24.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction32 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float36 = aDTFraction35.value();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction32.plus(aDTFraction35);
        boolean boolean39 = aDTFraction35.equals((java.lang.Object) ' ');
        boolean boolean41 = aDTFraction35.equals((java.lang.Object) "");
        float float42 = aDTFraction35.value();
        com.thealgorithms.maths.ADTFraction aDTFraction43 = aDTFraction24.times(aDTFraction35);
        boolean boolean44 = aDTFraction15.equals((java.lang.Object) aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction47 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction50 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float51 = aDTFraction50.value();
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction47.plus(aDTFraction50);
        int int53 = aDTFraction47.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction56 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction57 = aDTFraction47.plus(aDTFraction56);
        com.thealgorithms.maths.ADTFraction aDTFraction60 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction63 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float64 = aDTFraction63.value();
        com.thealgorithms.maths.ADTFraction aDTFraction65 = aDTFraction60.plus(aDTFraction63);
        int int66 = aDTFraction60.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction67 = aDTFraction56.times(aDTFraction60);
        com.thealgorithms.maths.ADTFraction aDTFraction68 = aDTFraction15.plus(aDTFraction56);
        com.thealgorithms.maths.ADTFraction aDTFraction70 = aDTFraction68.times((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0/-1" + "'", str12, "0/-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-0.0f) + "'", float25 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction26);
        org.junit.Assert.assertNotNull(aDTFraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-0.0f) + "'", float36 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-0.0f) + "'", float42 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-0.0f) + "'", float51 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(aDTFraction57);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + (-0.0f) + "'", float64 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(aDTFraction67);
        org.junit.Assert.assertNotNull(aDTFraction68);
        org.junit.Assert.assertNotNull(aDTFraction70);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        float float7 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float14 = aDTFraction13.value();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction10.plus(aDTFraction13);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float25 = aDTFraction24.value();
        com.thealgorithms.maths.ADTFraction aDTFraction26 = aDTFraction21.plus(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction18.times(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction30 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int31 = aDTFraction30.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction32 = aDTFraction18.times(aDTFraction30);
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction15.times(aDTFraction32);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = aDTFraction15.times(100);
        com.thealgorithms.maths.ADTFraction aDTFraction36 = aDTFraction5.times(aDTFraction15);
        com.thealgorithms.maths.ADTFraction aDTFraction38 = aDTFraction15.times((int) (short) 0);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction2.plus(aDTFraction15);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = aDTFraction2.reciprocal();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-0.0f) + "'", float7 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-0.0f) + "'", float14 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-0.0f) + "'", float25 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction26);
        org.junit.Assert.assertNotNull(aDTFraction27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(aDTFraction32);
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertNotNull(aDTFraction35);
        org.junit.Assert.assertNotNull(aDTFraction36);
        org.junit.Assert.assertNotNull(aDTFraction38);
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertNotNull(aDTFraction40);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction5.times((int) (byte) 100);
        java.lang.String str12 = aDTFraction5.toString();
        int int13 = aDTFraction5.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction5.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float25 = aDTFraction24.value();
        com.thealgorithms.maths.ADTFraction aDTFraction26 = aDTFraction21.plus(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction18.times(aDTFraction24);
        int int28 = aDTFraction24.numerator();
        int int29 = aDTFraction24.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction32 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float36 = aDTFraction35.value();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction32.plus(aDTFraction35);
        boolean boolean39 = aDTFraction35.equals((java.lang.Object) ' ');
        boolean boolean41 = aDTFraction35.equals((java.lang.Object) "");
        float float42 = aDTFraction35.value();
        com.thealgorithms.maths.ADTFraction aDTFraction43 = aDTFraction24.times(aDTFraction35);
        boolean boolean44 = aDTFraction15.equals((java.lang.Object) aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction47 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction50 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float51 = aDTFraction50.value();
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction47.plus(aDTFraction50);
        int int53 = aDTFraction47.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction56 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction57 = aDTFraction47.plus(aDTFraction56);
        com.thealgorithms.maths.ADTFraction aDTFraction60 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction63 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float64 = aDTFraction63.value();
        com.thealgorithms.maths.ADTFraction aDTFraction65 = aDTFraction60.plus(aDTFraction63);
        int int66 = aDTFraction60.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction67 = aDTFraction56.times(aDTFraction60);
        com.thealgorithms.maths.ADTFraction aDTFraction68 = aDTFraction15.plus(aDTFraction56);
        com.thealgorithms.maths.ADTFraction aDTFraction70 = aDTFraction56.times(0);
        java.lang.Class<?> wildcardClass71 = aDTFraction56.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0/-1" + "'", str12, "0/-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-0.0f) + "'", float25 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction26);
        org.junit.Assert.assertNotNull(aDTFraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-0.0f) + "'", float36 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-0.0f) + "'", float42 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-0.0f) + "'", float51 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(aDTFraction57);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + (-0.0f) + "'", float64 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(aDTFraction67);
        org.junit.Assert.assertNotNull(aDTFraction68);
        org.junit.Assert.assertNotNull(aDTFraction70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int15 = aDTFraction14.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction17 = aDTFraction2.reciprocal();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float24 = aDTFraction23.value();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction20.plus(aDTFraction23);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction34 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float35 = aDTFraction34.value();
        com.thealgorithms.maths.ADTFraction aDTFraction36 = aDTFraction31.plus(aDTFraction34);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction28.times(aDTFraction34);
        com.thealgorithms.maths.ADTFraction aDTFraction38 = aDTFraction23.plus(aDTFraction37);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction2.times(aDTFraction38);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        java.lang.String str43 = aDTFraction42.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction46 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction49 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float50 = aDTFraction49.value();
        com.thealgorithms.maths.ADTFraction aDTFraction51 = aDTFraction46.plus(aDTFraction49);
        com.thealgorithms.maths.ADTFraction aDTFraction54 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction57 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction60 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float61 = aDTFraction60.value();
        com.thealgorithms.maths.ADTFraction aDTFraction62 = aDTFraction57.plus(aDTFraction60);
        com.thealgorithms.maths.ADTFraction aDTFraction63 = aDTFraction54.times(aDTFraction60);
        com.thealgorithms.maths.ADTFraction aDTFraction66 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int67 = aDTFraction66.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction68 = aDTFraction54.times(aDTFraction66);
        com.thealgorithms.maths.ADTFraction aDTFraction69 = aDTFraction51.times(aDTFraction68);
        com.thealgorithms.maths.ADTFraction aDTFraction72 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction75 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction78 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float79 = aDTFraction78.value();
        com.thealgorithms.maths.ADTFraction aDTFraction80 = aDTFraction75.plus(aDTFraction78);
        com.thealgorithms.maths.ADTFraction aDTFraction81 = aDTFraction72.times(aDTFraction78);
        com.thealgorithms.maths.ADTFraction aDTFraction82 = aDTFraction69.times(aDTFraction72);
        com.thealgorithms.maths.ADTFraction aDTFraction84 = aDTFraction69.times((int) (short) 1);
        com.thealgorithms.maths.ADTFraction aDTFraction85 = aDTFraction42.times(aDTFraction69);
        java.lang.String str86 = aDTFraction42.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction87 = aDTFraction2.times(aDTFraction42);
        int int88 = aDTFraction2.numerator();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertNotNull(aDTFraction17);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-0.0f) + "'", float24 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-0.0f) + "'", float35 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction36);
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertNotNull(aDTFraction38);
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0/-1" + "'", str43, "0/-1");
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-0.0f) + "'", float50 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction51);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-0.0f) + "'", float61 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction62);
        org.junit.Assert.assertNotNull(aDTFraction63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
        org.junit.Assert.assertNotNull(aDTFraction68);
        org.junit.Assert.assertNotNull(aDTFraction69);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + (-0.0f) + "'", float79 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction80);
        org.junit.Assert.assertNotNull(aDTFraction81);
        org.junit.Assert.assertNotNull(aDTFraction82);
        org.junit.Assert.assertNotNull(aDTFraction84);
        org.junit.Assert.assertNotNull(aDTFraction85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "0/-1" + "'", str86, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (short) -1, 32);
        float float3 = aDTFraction2.value();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-0.03125f) + "'", float3 == (-0.03125f));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int3 = aDTFraction2.denominator();
        boolean boolean5 = aDTFraction2.equals((java.lang.Object) (short) 0);
        com.thealgorithms.maths.ADTFraction aDTFraction6 = aDTFraction2.reciprocal();
        java.lang.String str7 = aDTFraction2.toString();
        java.lang.Class<?> wildcardClass8 = aDTFraction2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(aDTFraction6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100/100" + "'", str7, "100/100");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((int) '4', (int) (byte) 10);
        int int3 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction6 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction9 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction12 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float13 = aDTFraction12.value();
        com.thealgorithms.maths.ADTFraction aDTFraction14 = aDTFraction9.plus(aDTFraction12);
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction6.times(aDTFraction12);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float19 = aDTFraction18.value();
        boolean boolean20 = aDTFraction12.equals((java.lang.Object) aDTFraction18);
        java.lang.String str21 = aDTFraction18.toString();
        java.lang.String str22 = aDTFraction18.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction18.times((int) (short) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction27 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction30 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction33 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float34 = aDTFraction33.value();
        com.thealgorithms.maths.ADTFraction aDTFraction35 = aDTFraction30.plus(aDTFraction33);
        com.thealgorithms.maths.ADTFraction aDTFraction36 = aDTFraction27.times(aDTFraction33);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int40 = aDTFraction39.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction41 = aDTFraction27.times(aDTFraction39);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction27.reciprocal();
        int int43 = aDTFraction42.numerator();
        float float44 = aDTFraction42.value();
        com.thealgorithms.maths.ADTFraction aDTFraction45 = aDTFraction24.times(aDTFraction42);
        com.thealgorithms.maths.ADTFraction aDTFraction48 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int49 = aDTFraction48.denominator();
        float float50 = aDTFraction48.value();
        com.thealgorithms.maths.ADTFraction aDTFraction51 = aDTFraction48.reciprocal();
        int int52 = aDTFraction51.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction53 = aDTFraction45.plus(aDTFraction51);
        com.thealgorithms.maths.ADTFraction aDTFraction54 = aDTFraction2.times(aDTFraction45);
        java.lang.String str55 = aDTFraction54.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-0.0f) + "'", float13 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction14);
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.0f) + "'", float19 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0/-1" + "'", str21, "0/-1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0/-1" + "'", str22, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-0.0f) + "'", float34 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction35);
        org.junit.Assert.assertNotNull(aDTFraction36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertNotNull(aDTFraction41);
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-1.0f) + "'", float44 == (-1.0f));
        org.junit.Assert.assertNotNull(aDTFraction45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 1.0f + "'", float50 == 1.0f);
        org.junit.Assert.assertNotNull(aDTFraction51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(aDTFraction53);
        org.junit.Assert.assertNotNull(aDTFraction54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "0/10" + "'", str55, "0/10");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction5.times((int) (byte) 100);
        java.lang.String str12 = aDTFraction5.toString();
        int int13 = aDTFraction5.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction5.times((int) (byte) 100);
        int int16 = aDTFraction5.denominator();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0/-1" + "'", str12, "0/-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) ' ');
        boolean boolean11 = aDTFraction5.equals((java.lang.Object) "");
        java.lang.String str12 = aDTFraction5.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float19 = aDTFraction18.value();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction15.plus(aDTFraction18);
        int int21 = aDTFraction15.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction15.plus(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float32 = aDTFraction31.value();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction28.plus(aDTFraction31);
        int int34 = aDTFraction28.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction35 = aDTFraction24.times(aDTFraction28);
        float float36 = aDTFraction35.value();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction5.plus(aDTFraction35);
        java.lang.String str38 = aDTFraction35.toString();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0/-1" + "'", str12, "0/-1");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.0f) + "'", float19 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-0.0f) + "'", float32 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(aDTFraction35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0/1" + "'", str38, "0/1");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        int int8 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction12 = aDTFraction2.plus(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction15 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float19 = aDTFraction18.value();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction15.plus(aDTFraction18);
        int int21 = aDTFraction15.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction22 = aDTFraction11.times(aDTFraction15);
        float float23 = aDTFraction22.value();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction22.times((int) (short) 0);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction((int) (byte) -1, 1);
        int int29 = aDTFraction28.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction30 = aDTFraction22.plus(aDTFraction28);
        com.thealgorithms.maths.ADTFraction aDTFraction33 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction36 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float40 = aDTFraction39.value();
        com.thealgorithms.maths.ADTFraction aDTFraction41 = aDTFraction36.plus(aDTFraction39);
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction33.times(aDTFraction39);
        int int43 = aDTFraction39.numerator();
        int int44 = aDTFraction39.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction47 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction50 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float51 = aDTFraction50.value();
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction47.plus(aDTFraction50);
        com.thealgorithms.maths.ADTFraction aDTFraction55 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction58 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction61 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float62 = aDTFraction61.value();
        com.thealgorithms.maths.ADTFraction aDTFraction63 = aDTFraction58.plus(aDTFraction61);
        com.thealgorithms.maths.ADTFraction aDTFraction64 = aDTFraction55.times(aDTFraction61);
        com.thealgorithms.maths.ADTFraction aDTFraction67 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int68 = aDTFraction67.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction69 = aDTFraction55.times(aDTFraction67);
        com.thealgorithms.maths.ADTFraction aDTFraction70 = aDTFraction52.times(aDTFraction69);
        com.thealgorithms.maths.ADTFraction aDTFraction73 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction76 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float77 = aDTFraction76.value();
        com.thealgorithms.maths.ADTFraction aDTFraction78 = aDTFraction73.plus(aDTFraction76);
        boolean boolean80 = aDTFraction76.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction82 = aDTFraction76.times((int) (byte) 100);
        java.lang.String str83 = aDTFraction76.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction84 = aDTFraction52.times(aDTFraction76);
        int int85 = aDTFraction52.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction86 = aDTFraction39.plus(aDTFraction52);
        com.thealgorithms.maths.ADTFraction aDTFraction87 = aDTFraction22.plus(aDTFraction52);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(aDTFraction12);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.0f) + "'", float19 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(aDTFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(aDTFraction30);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-0.0f) + "'", float40 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction41);
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-0.0f) + "'", float51 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + (-0.0f) + "'", float62 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction63);
        org.junit.Assert.assertNotNull(aDTFraction64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertNotNull(aDTFraction69);
        org.junit.Assert.assertNotNull(aDTFraction70);
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + (-0.0f) + "'", float77 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(aDTFraction82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "0/-1" + "'", str83, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(aDTFraction86);
        org.junit.Assert.assertNotNull(aDTFraction87);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) ' ');
        boolean boolean11 = aDTFraction5.equals((java.lang.Object) "");
        int int12 = aDTFraction5.denominator();
        java.lang.String str13 = aDTFraction5.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) 10);
        com.thealgorithms.maths.ADTFraction aDTFraction17 = aDTFraction5.plus(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = aDTFraction16.times((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0/-1" + "'", str13, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction17);
        org.junit.Assert.assertNotNull(aDTFraction19);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        boolean boolean12 = aDTFraction8.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction14 = aDTFraction8.times((int) (byte) 100);
        float float15 = aDTFraction8.value();
        boolean boolean16 = aDTFraction2.equals((java.lang.Object) aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float23 = aDTFraction22.value();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction19.plus(aDTFraction22);
        boolean boolean26 = aDTFraction22.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction28 = aDTFraction22.times((int) (byte) 100);
        java.lang.String str29 = aDTFraction22.toString();
        int int30 = aDTFraction22.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction32 = aDTFraction22.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction8.times(aDTFraction32);
        int int34 = aDTFraction33.numerator();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(aDTFraction14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-0.0f) + "'", float15 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-0.0f) + "'", float23 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(aDTFraction28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0/-1" + "'", str29, "0/-1");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction32);
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float17 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction13.plus(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = aDTFraction10.times(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int23 = aDTFraction22.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction10.times(aDTFraction22);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction7.times(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction7.times(100);
        com.thealgorithms.maths.ADTFraction aDTFraction29 = aDTFraction7.times((int) (byte) 10);
        com.thealgorithms.maths.ADTFraction aDTFraction32 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float36 = aDTFraction35.value();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction32.plus(aDTFraction35);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction43 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction46 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float47 = aDTFraction46.value();
        com.thealgorithms.maths.ADTFraction aDTFraction48 = aDTFraction43.plus(aDTFraction46);
        com.thealgorithms.maths.ADTFraction aDTFraction49 = aDTFraction40.times(aDTFraction46);
        com.thealgorithms.maths.ADTFraction aDTFraction52 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int53 = aDTFraction52.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction54 = aDTFraction40.times(aDTFraction52);
        com.thealgorithms.maths.ADTFraction aDTFraction55 = aDTFraction37.times(aDTFraction54);
        com.thealgorithms.maths.ADTFraction aDTFraction58 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction61 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float62 = aDTFraction61.value();
        com.thealgorithms.maths.ADTFraction aDTFraction63 = aDTFraction58.plus(aDTFraction61);
        boolean boolean65 = aDTFraction61.equals((java.lang.Object) ' ');
        boolean boolean67 = aDTFraction61.equals((java.lang.Object) "");
        java.lang.String str68 = aDTFraction61.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction69 = aDTFraction55.times(aDTFraction61);
        float float70 = aDTFraction69.value();
        java.lang.String str71 = aDTFraction69.toString();
        java.lang.String str72 = aDTFraction69.toString();
        boolean boolean73 = aDTFraction29.equals((java.lang.Object) str72);
        java.lang.String str74 = aDTFraction29.toString();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.0f) + "'", float17 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertNotNull(aDTFraction19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertNotNull(aDTFraction27);
        org.junit.Assert.assertNotNull(aDTFraction29);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-0.0f) + "'", float36 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-0.0f) + "'", float47 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction48);
        org.junit.Assert.assertNotNull(aDTFraction49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertNotNull(aDTFraction54);
        org.junit.Assert.assertNotNull(aDTFraction55);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + (-0.0f) + "'", float62 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "0/-1" + "'", str68, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction69);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + (-0.0f) + "'", float70 == (-0.0f));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "0/-100" + "'", str71, "0/-100");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "0/-100" + "'", str72, "0/-100");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "0/1" + "'", str74, "0/1");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction5.times((int) (byte) 100);
        java.lang.String str12 = aDTFraction5.toString();
        int int13 = aDTFraction5.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction5.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float25 = aDTFraction24.value();
        com.thealgorithms.maths.ADTFraction aDTFraction26 = aDTFraction21.plus(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction18.times(aDTFraction24);
        int int28 = aDTFraction24.numerator();
        int int29 = aDTFraction24.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction32 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float36 = aDTFraction35.value();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction32.plus(aDTFraction35);
        boolean boolean39 = aDTFraction35.equals((java.lang.Object) ' ');
        boolean boolean41 = aDTFraction35.equals((java.lang.Object) "");
        float float42 = aDTFraction35.value();
        com.thealgorithms.maths.ADTFraction aDTFraction43 = aDTFraction24.times(aDTFraction35);
        boolean boolean44 = aDTFraction15.equals((java.lang.Object) aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction47 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction50 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float51 = aDTFraction50.value();
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction47.plus(aDTFraction50);
        int int53 = aDTFraction47.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction56 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction57 = aDTFraction47.plus(aDTFraction56);
        com.thealgorithms.maths.ADTFraction aDTFraction60 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction63 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float64 = aDTFraction63.value();
        com.thealgorithms.maths.ADTFraction aDTFraction65 = aDTFraction60.plus(aDTFraction63);
        int int66 = aDTFraction60.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction67 = aDTFraction56.times(aDTFraction60);
        com.thealgorithms.maths.ADTFraction aDTFraction68 = aDTFraction15.plus(aDTFraction56);
        java.lang.Class<?> wildcardClass69 = aDTFraction56.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0/-1" + "'", str12, "0/-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-0.0f) + "'", float25 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction26);
        org.junit.Assert.assertNotNull(aDTFraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-0.0f) + "'", float36 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-0.0f) + "'", float42 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-0.0f) + "'", float51 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(aDTFraction57);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + (-0.0f) + "'", float64 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(aDTFraction67);
        org.junit.Assert.assertNotNull(aDTFraction68);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        boolean boolean9 = aDTFraction5.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction5.times((int) (byte) 100);
        java.lang.String str12 = aDTFraction5.toString();
        int int13 = aDTFraction5.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = aDTFraction5.times((int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction21 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction24 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float25 = aDTFraction24.value();
        com.thealgorithms.maths.ADTFraction aDTFraction26 = aDTFraction21.plus(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction27 = aDTFraction18.times(aDTFraction24);
        int int28 = aDTFraction24.numerator();
        int int29 = aDTFraction24.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction32 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float36 = aDTFraction35.value();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction32.plus(aDTFraction35);
        boolean boolean39 = aDTFraction35.equals((java.lang.Object) ' ');
        boolean boolean41 = aDTFraction35.equals((java.lang.Object) "");
        float float42 = aDTFraction35.value();
        com.thealgorithms.maths.ADTFraction aDTFraction43 = aDTFraction24.times(aDTFraction35);
        boolean boolean44 = aDTFraction15.equals((java.lang.Object) aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction47 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction50 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float51 = aDTFraction50.value();
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction47.plus(aDTFraction50);
        int int53 = aDTFraction47.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction56 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction57 = aDTFraction47.plus(aDTFraction56);
        com.thealgorithms.maths.ADTFraction aDTFraction60 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction63 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float64 = aDTFraction63.value();
        com.thealgorithms.maths.ADTFraction aDTFraction65 = aDTFraction60.plus(aDTFraction63);
        int int66 = aDTFraction60.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction67 = aDTFraction56.times(aDTFraction60);
        com.thealgorithms.maths.ADTFraction aDTFraction68 = aDTFraction15.plus(aDTFraction56);
        com.thealgorithms.maths.ADTFraction aDTFraction70 = aDTFraction56.times(0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.ADTFraction aDTFraction71 = aDTFraction70.reciprocal();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Denominator cannot be 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0/-1" + "'", str12, "0/-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(aDTFraction15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-0.0f) + "'", float25 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction26);
        org.junit.Assert.assertNotNull(aDTFraction27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-0.0f) + "'", float36 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-0.0f) + "'", float42 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-0.0f) + "'", float51 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(aDTFraction57);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + (-0.0f) + "'", float64 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(aDTFraction67);
        org.junit.Assert.assertNotNull(aDTFraction68);
        org.junit.Assert.assertNotNull(aDTFraction70);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int15 = aDTFraction14.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction14);
        com.thealgorithms.maths.ADTFraction aDTFraction17 = aDTFraction2.reciprocal();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float24 = aDTFraction23.value();
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction20.plus(aDTFraction23);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction34 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float35 = aDTFraction34.value();
        com.thealgorithms.maths.ADTFraction aDTFraction36 = aDTFraction31.plus(aDTFraction34);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction28.times(aDTFraction34);
        com.thealgorithms.maths.ADTFraction aDTFraction38 = aDTFraction23.plus(aDTFraction37);
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction2.times(aDTFraction38);
        int int40 = aDTFraction38.denominator();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertNotNull(aDTFraction17);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-0.0f) + "'", float24 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-0.0f) + "'", float35 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction36);
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertNotNull(aDTFraction38);
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int15 = aDTFraction14.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction14);
        float float17 = aDTFraction2.value();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        com.thealgorithms.maths.ADTFraction aDTFraction10 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction13 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction16 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float17 = aDTFraction16.value();
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction13.plus(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction19 = aDTFraction10.times(aDTFraction16);
        com.thealgorithms.maths.ADTFraction aDTFraction22 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int23 = aDTFraction22.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction24 = aDTFraction10.times(aDTFraction22);
        com.thealgorithms.maths.ADTFraction aDTFraction25 = aDTFraction7.times(aDTFraction24);
        com.thealgorithms.maths.ADTFraction aDTFraction28 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float32 = aDTFraction31.value();
        com.thealgorithms.maths.ADTFraction aDTFraction33 = aDTFraction28.plus(aDTFraction31);
        boolean boolean35 = aDTFraction31.equals((java.lang.Object) ' ');
        boolean boolean37 = aDTFraction31.equals((java.lang.Object) "");
        java.lang.String str38 = aDTFraction31.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction25.times(aDTFraction31);
        float float40 = aDTFraction39.value();
        java.lang.String str41 = aDTFraction39.toString();
        int int42 = aDTFraction39.denominator();
        int int43 = aDTFraction39.numerator();
        int int44 = aDTFraction39.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction47 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction50 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float51 = aDTFraction50.value();
        com.thealgorithms.maths.ADTFraction aDTFraction52 = aDTFraction47.plus(aDTFraction50);
        int int53 = aDTFraction47.numerator();
        boolean boolean55 = aDTFraction47.equals((java.lang.Object) (short) 1);
        com.thealgorithms.maths.ADTFraction aDTFraction56 = aDTFraction39.plus(aDTFraction47);
        com.thealgorithms.maths.ADTFraction aDTFraction59 = new com.thealgorithms.maths.ADTFraction((int) '4', (int) '4');
        com.thealgorithms.maths.ADTFraction aDTFraction62 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction63 = aDTFraction59.plus(aDTFraction62);
        com.thealgorithms.maths.ADTFraction aDTFraction65 = aDTFraction59.times((-100));
        com.thealgorithms.maths.ADTFraction aDTFraction67 = aDTFraction59.times((int) (short) 100);
        boolean boolean68 = aDTFraction39.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-0.0f) + "'", float17 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertNotNull(aDTFraction19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(aDTFraction24);
        org.junit.Assert.assertNotNull(aDTFraction25);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-0.0f) + "'", float32 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0/-1" + "'", str38, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-0.0f) + "'", float40 == (-0.0f));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0/-100" + "'", str41, "0/-100");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-100) + "'", int42 == (-100));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-100) + "'", int44 == (-100));
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-0.0f) + "'", float51 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(aDTFraction56);
        org.junit.Assert.assertNotNull(aDTFraction63);
        org.junit.Assert.assertNotNull(aDTFraction65);
        org.junit.Assert.assertNotNull(aDTFraction67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float9 = aDTFraction8.value();
        com.thealgorithms.maths.ADTFraction aDTFraction10 = aDTFraction5.plus(aDTFraction8);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = aDTFraction2.times(aDTFraction8);
        int int12 = aDTFraction8.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction15 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float19 = aDTFraction18.value();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction15.plus(aDTFraction18);
        java.lang.String str21 = aDTFraction15.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction22 = aDTFraction8.plus(aDTFraction15);
        float float23 = aDTFraction22.value();
        com.thealgorithms.maths.ADTFraction aDTFraction26 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction29 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float30 = aDTFraction29.value();
        com.thealgorithms.maths.ADTFraction aDTFraction31 = aDTFraction26.plus(aDTFraction29);
        int int32 = aDTFraction26.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction34 = aDTFraction26.times((int) '#');
        com.thealgorithms.maths.ADTFraction aDTFraction37 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float41 = aDTFraction40.value();
        com.thealgorithms.maths.ADTFraction aDTFraction42 = aDTFraction37.plus(aDTFraction40);
        boolean boolean44 = aDTFraction40.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction46 = aDTFraction40.times((int) (byte) 100);
        float float47 = aDTFraction40.value();
        com.thealgorithms.maths.ADTFraction aDTFraction48 = aDTFraction26.plus(aDTFraction40);
        int int49 = aDTFraction26.numerator();
        java.lang.String str50 = aDTFraction26.toString();
        com.thealgorithms.maths.ADTFraction aDTFraction51 = aDTFraction22.plus(aDTFraction26);
        com.thealgorithms.maths.ADTFraction aDTFraction54 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction57 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction60 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float61 = aDTFraction60.value();
        com.thealgorithms.maths.ADTFraction aDTFraction62 = aDTFraction57.plus(aDTFraction60);
        com.thealgorithms.maths.ADTFraction aDTFraction63 = aDTFraction54.times(aDTFraction60);
        com.thealgorithms.maths.ADTFraction aDTFraction66 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float67 = aDTFraction66.value();
        boolean boolean68 = aDTFraction60.equals((java.lang.Object) aDTFraction66);
        com.thealgorithms.maths.ADTFraction aDTFraction71 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction74 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float75 = aDTFraction74.value();
        com.thealgorithms.maths.ADTFraction aDTFraction76 = aDTFraction71.plus(aDTFraction74);
        boolean boolean78 = aDTFraction71.equals((java.lang.Object) 10);
        boolean boolean79 = aDTFraction66.equals((java.lang.Object) aDTFraction71);
        com.thealgorithms.maths.ADTFraction aDTFraction80 = aDTFraction22.plus(aDTFraction71);
        float float81 = aDTFraction80.value();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-0.0f) + "'", float9 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction10);
        org.junit.Assert.assertNotNull(aDTFraction11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.0f) + "'", float19 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0/-1" + "'", str21, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-0.0f) + "'", float30 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(aDTFraction34);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-0.0f) + "'", float41 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(aDTFraction46);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-0.0f) + "'", float47 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0/-1" + "'", str50, "0/-1");
        org.junit.Assert.assertNotNull(aDTFraction51);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-0.0f) + "'", float61 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction62);
        org.junit.Assert.assertNotNull(aDTFraction63);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + (-0.0f) + "'", float67 == (-0.0f));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + (-0.0f) + "'", float75 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(aDTFraction80);
        org.junit.Assert.assertTrue("'" + float81 + "' != '" + (-0.0f) + "'", float81 == (-0.0f));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction8 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float12 = aDTFraction11.value();
        com.thealgorithms.maths.ADTFraction aDTFraction13 = aDTFraction8.plus(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction14 = aDTFraction5.times(aDTFraction11);
        int int15 = aDTFraction11.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction16 = aDTFraction2.times(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = aDTFraction11.times((int) (byte) 0);
        int int19 = aDTFraction18.denominator();
        float float20 = aDTFraction18.value();
        com.thealgorithms.maths.ADTFraction aDTFraction23 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction26 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float27 = aDTFraction26.value();
        com.thealgorithms.maths.ADTFraction aDTFraction28 = aDTFraction23.plus(aDTFraction26);
        com.thealgorithms.maths.ADTFraction aDTFraction31 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction34 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction37 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float38 = aDTFraction37.value();
        com.thealgorithms.maths.ADTFraction aDTFraction39 = aDTFraction34.plus(aDTFraction37);
        com.thealgorithms.maths.ADTFraction aDTFraction40 = aDTFraction31.times(aDTFraction37);
        com.thealgorithms.maths.ADTFraction aDTFraction43 = new com.thealgorithms.maths.ADTFraction((int) (short) 100, 100);
        int int44 = aDTFraction43.denominator();
        com.thealgorithms.maths.ADTFraction aDTFraction45 = aDTFraction31.times(aDTFraction43);
        com.thealgorithms.maths.ADTFraction aDTFraction46 = aDTFraction28.times(aDTFraction45);
        com.thealgorithms.maths.ADTFraction aDTFraction49 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction52 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction55 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float56 = aDTFraction55.value();
        com.thealgorithms.maths.ADTFraction aDTFraction57 = aDTFraction52.plus(aDTFraction55);
        com.thealgorithms.maths.ADTFraction aDTFraction58 = aDTFraction49.times(aDTFraction55);
        com.thealgorithms.maths.ADTFraction aDTFraction59 = aDTFraction46.times(aDTFraction49);
        com.thealgorithms.maths.ADTFraction aDTFraction60 = aDTFraction18.times(aDTFraction59);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.maths.ADTFraction aDTFraction61 = aDTFraction18.reciprocal();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Denominator cannot be 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-0.0f) + "'", float12 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction13);
        org.junit.Assert.assertNotNull(aDTFraction14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(aDTFraction16);
        org.junit.Assert.assertNotNull(aDTFraction18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-0.0f) + "'", float20 == (-0.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-0.0f) + "'", float27 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction28);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-0.0f) + "'", float38 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction39);
        org.junit.Assert.assertNotNull(aDTFraction40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertNotNull(aDTFraction45);
        org.junit.Assert.assertNotNull(aDTFraction46);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + (-0.0f) + "'", float56 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction57);
        org.junit.Assert.assertNotNull(aDTFraction58);
        org.junit.Assert.assertNotNull(aDTFraction59);
        org.junit.Assert.assertNotNull(aDTFraction60);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.thealgorithms.maths.ADTFraction aDTFraction2 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction5 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float6 = aDTFraction5.value();
        com.thealgorithms.maths.ADTFraction aDTFraction7 = aDTFraction2.plus(aDTFraction5);
        int int8 = aDTFraction2.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction11 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction12 = aDTFraction2.plus(aDTFraction11);
        com.thealgorithms.maths.ADTFraction aDTFraction15 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction18 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float19 = aDTFraction18.value();
        com.thealgorithms.maths.ADTFraction aDTFraction20 = aDTFraction15.plus(aDTFraction18);
        int int21 = aDTFraction15.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction22 = aDTFraction11.times(aDTFraction15);
        float float23 = aDTFraction22.value();
        com.thealgorithms.maths.ADTFraction aDTFraction26 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction29 = new com.thealgorithms.maths.ADTFraction((-1), 1);
        com.thealgorithms.maths.ADTFraction aDTFraction32 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction35 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float36 = aDTFraction35.value();
        com.thealgorithms.maths.ADTFraction aDTFraction37 = aDTFraction32.plus(aDTFraction35);
        com.thealgorithms.maths.ADTFraction aDTFraction38 = aDTFraction29.times(aDTFraction35);
        int int39 = aDTFraction35.numerator();
        com.thealgorithms.maths.ADTFraction aDTFraction40 = aDTFraction26.times(aDTFraction35);
        com.thealgorithms.maths.ADTFraction aDTFraction43 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction46 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float47 = aDTFraction46.value();
        com.thealgorithms.maths.ADTFraction aDTFraction48 = aDTFraction43.plus(aDTFraction46);
        java.lang.Class<?> wildcardClass49 = aDTFraction46.getClass();
        boolean boolean50 = aDTFraction26.equals((java.lang.Object) aDTFraction46);
        com.thealgorithms.maths.ADTFraction aDTFraction53 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        com.thealgorithms.maths.ADTFraction aDTFraction56 = new com.thealgorithms.maths.ADTFraction(0, (int) (short) -1);
        float float57 = aDTFraction56.value();
        com.thealgorithms.maths.ADTFraction aDTFraction58 = aDTFraction53.plus(aDTFraction56);
        boolean boolean60 = aDTFraction56.equals((java.lang.Object) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction62 = aDTFraction56.times((int) (byte) 100);
        com.thealgorithms.maths.ADTFraction aDTFraction63 = aDTFraction46.times(aDTFraction62);
        com.thealgorithms.maths.ADTFraction aDTFraction66 = new com.thealgorithms.maths.ADTFraction((int) '4', (int) '4');
        com.thealgorithms.maths.ADTFraction aDTFraction67 = aDTFraction62.plus(aDTFraction66);
        com.thealgorithms.maths.ADTFraction aDTFraction68 = aDTFraction22.times(aDTFraction66);
        com.thealgorithms.maths.ADTFraction aDTFraction71 = new com.thealgorithms.maths.ADTFraction(10, (int) ' ');
        com.thealgorithms.maths.ADTFraction aDTFraction72 = aDTFraction68.plus(aDTFraction71);
        int int73 = aDTFraction68.denominator();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-0.0f) + "'", float6 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(aDTFraction12);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-0.0f) + "'", float19 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(aDTFraction22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + (-0.0f) + "'", float36 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction37);
        org.junit.Assert.assertNotNull(aDTFraction38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(aDTFraction40);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-0.0f) + "'", float47 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + (-0.0f) + "'", float57 == (-0.0f));
        org.junit.Assert.assertNotNull(aDTFraction58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(aDTFraction62);
        org.junit.Assert.assertNotNull(aDTFraction63);
        org.junit.Assert.assertNotNull(aDTFraction67);
        org.junit.Assert.assertNotNull(aDTFraction68);
        org.junit.Assert.assertNotNull(aDTFraction72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 52 + "'", int73 == 52);
    }
}

