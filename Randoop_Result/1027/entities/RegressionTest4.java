package entities;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) (byte) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setBurstTime(35);
        int int21 = processDetails3.getBurstTime();
        int int22 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 52);
        processDetails3.setWaitingTime((int) (short) 100);
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        processDetails3.setBurstTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setBurstTime(0);
        int int12 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) ' ');
        int int17 = processDetails3.getBurstTime();
        int int18 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setWaitingTime((int) (byte) 0);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setBurstTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setBurstTime((int) '#');
        int int9 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass10 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(35);
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) (byte) 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setWaitingTime((int) '4');
        int int9 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, (int) (byte) 0);
        int int4 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass5 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getWaitingTime();
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(100);
        int int11 = processDetails3.getArrivalTime();
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        int int15 = processDetails3.getBurstTime();
        java.lang.String str16 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 100, (int) (short) 1);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str14 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(0);
        int int17 = processDetails3.getWaitingTime();
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setWaitingTime(97);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) -1);
        int int23 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        int int17 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass18 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) ' ');
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(35);
        processDetails3.setArrivalTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 1);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, (int) (byte) -1);
        processDetails3.setArrivalTime((int) (short) 10);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, 10);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setWaitingTime((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 35, (int) 'a');
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', (int) (short) 0);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) -1, (int) (byte) 10);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((-1));
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str15 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int18 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(0);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(35);
        int int14 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) -1, (-1));
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setBurstTime(100);
        processDetails3.setWaitingTime(1);
        java.lang.String str18 = processDetails3.getProcessId();
        int int19 = processDetails3.getBurstTime();
        int int20 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setBurstTime((int) (byte) 100);
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime(100);
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(10);
        processDetails3.setWaitingTime((int) (byte) 100);
        int int10 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 100, (int) '4');
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, (int) '#');
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        int int7 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setWaitingTime((int) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setBurstTime((int) (byte) 10);
        processDetails3.setBurstTime((int) (short) 1);
        int int20 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((-1));
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setWaitingTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setWaitingTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(0);
        int int14 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 10, (int) (byte) 0);
        processDetails3.setWaitingTime((int) (byte) 100);
        int int6 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(10);
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setBurstTime(32);
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setProcessId("");
        java.lang.String str18 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setArrivalTime(52);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 10);
        java.lang.String str4 = processDetails3.getProcessId();
        int int5 = processDetails3.getWaitingTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(1);
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) 0);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(10);
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime(10);
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getBurstTime();
        int int17 = processDetails3.getWaitingTime();
        int int18 = processDetails3.getWaitingTime();
        int int19 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setBurstTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(35);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(35);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 100, 52);
        processDetails3.setBurstTime((int) ' ');
        int int6 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(52);
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setWaitingTime((-1));
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str9 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) '4');
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setBurstTime(1);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setWaitingTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(52);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setBurstTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        java.lang.String str7 = processDetails3.getProcessId();
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((-1));
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) 'a');
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (byte) 10);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getBurstTime();
        int int17 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, 0);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(0);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(52);
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) ' ');
        java.lang.String str9 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setWaitingTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, (int) '#');
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setWaitingTime(52);
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setArrivalTime((int) ' ');
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setWaitingTime((int) '4');
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int6 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) -1);
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setBurstTime(0);
        processDetails3.setProcessId("hi!");
        int int19 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) '4');
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (byte) 10);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setTurnAroundTimeTime(35);
        processDetails3.setTurnAroundTimeTime(97);
        java.lang.String str17 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setWaitingTime((int) (short) 1);
        int int15 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 100);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, (int) 'a');
        int int4 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass5 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) 0);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(10);
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setProcessId("");
        java.lang.String str16 = processDetails3.getProcessId();
        int int17 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        java.lang.String str7 = processDetails3.getProcessId();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(0);
        int int7 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) 'a');
        processDetails3.setArrivalTime((int) (short) -1);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, (int) '#');
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) (byte) 10);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(100);
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) ' ');
        int int17 = processDetails3.getArrivalTime();
        int int18 = processDetails3.getWaitingTime();
        int int19 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getArrivalTime();
        java.lang.String str17 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        int int20 = processDetails3.getArrivalTime();
        int int21 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setArrivalTime((int) ' ');
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((-1));
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (byte) 1);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getBurstTime();
        int int17 = processDetails3.getBurstTime();
        int int18 = processDetails3.getWaitingTime();
        int int19 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) 0);
        int int22 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        java.lang.String str25 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(32);
        int int17 = processDetails3.getWaitingTime();
        int int18 = processDetails3.getBurstTime();
        java.lang.String str19 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) '4');
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 1, 35);
        processDetails3.setTurnAroundTimeTime(35);
        processDetails3.setWaitingTime((int) (byte) 10);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (short) 1);
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', 32);
        processDetails3.setWaitingTime((int) (byte) 10);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) (byte) 100);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(1);
        int int9 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setProcessId("hi!");
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setArrivalTime((-1));
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setWaitingTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 10, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass5 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setTurnAroundTimeTime(100);
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(97);
        int int21 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) '#');
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (short) -1);
        int int17 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 100, (int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, 35);
        processDetails3.setBurstTime((int) (short) 100);
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 97);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) 100);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, (int) '4');
        processDetails3.setBurstTime(100);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 32, (int) (byte) 10);
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime(0);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) -1);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(10);
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) -1, 32);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setArrivalTime((int) (byte) 100);
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(1);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 0);
        int int4 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass5 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        processDetails3.setWaitingTime((int) (byte) 1);
        int int17 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        int int22 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setArrivalTime((int) (short) -1);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setWaitingTime((int) (byte) 0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        int int9 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setWaitingTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '#', (int) ' ');
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setProcessId("hi!");
        java.lang.String str18 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) '4');
        int int21 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 52);
        processDetails3.setWaitingTime((int) (short) 100);
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setWaitingTime(97);
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getBurstTime();
        int int17 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) ' ');
        int int20 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime(100);
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime(100);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) ' ');
        int int17 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (short) 10);
        java.lang.Class<?> wildcardClass20 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, 0);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (byte) 0);
        java.lang.String str11 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(1);
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) 'a', 97);
        processDetails3.setArrivalTime((int) ' ');
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(52);
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(0);
        int int13 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 100, 97);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getBurstTime();
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), 1);
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int8 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (byte) 10);
        processDetails3.setArrivalTime(32);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 97);
        int int4 = processDetails3.getArrivalTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(10);
        processDetails3.setBurstTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setTurnAroundTimeTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) -1, 97);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) '4');
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 0);
        processDetails3.setWaitingTime((int) '4');
        int int6 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, (int) '4');
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        int int11 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setArrivalTime((int) (byte) 100);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(1);
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        processDetails3.setArrivalTime(0);
        processDetails3.setArrivalTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) '4');
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (short) -1);
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setWaitingTime(52);
        processDetails3.setArrivalTime((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setArrivalTime((int) '4');
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(10);
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) -1, 10);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setBurstTime(100);
        processDetails3.setArrivalTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getWaitingTime();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setArrivalTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) ' ');
        int int17 = processDetails3.getBurstTime();
        int int18 = processDetails3.getArrivalTime();
        java.lang.String str19 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setBurstTime((int) '4');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setArrivalTime(0);
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), 52);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setBurstTime((int) '#');
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setTurnAroundTimeTime(97);
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 35, (int) '#');
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        processDetails3.setBurstTime(0);
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) -1);
        int int16 = processDetails3.getBurstTime();
        int int17 = processDetails3.getTurnAroundTimeTime();
        int int18 = processDetails3.getTurnAroundTimeTime();
        int int19 = processDetails3.getArrivalTime();
        int int20 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 10);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', (int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int6 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setBurstTime((int) '#');
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 97);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((-1));
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 1);
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) 'a');
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(10);
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(10);
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (byte) 100);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        int int17 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 97);
        java.lang.String str4 = processDetails3.getProcessId();
        int int5 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(100);
        processDetails3.setArrivalTime(10);
        processDetails3.setProcessId("hi!");
        int int14 = processDetails3.getArrivalTime();
        java.lang.String str15 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setProcessId("");
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime((int) '4');
        processDetails3.setWaitingTime(100);
        int int14 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) ' ');
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setBurstTime((int) (byte) 10);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) 'a', 32);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(52);
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) '#');
        processDetails3.setWaitingTime(0);
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int13 = processDetails3.getWaitingTime();
        java.lang.String str14 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, (int) (short) 1);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime(1);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(97);
        processDetails3.setBurstTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', 10);
        int int4 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str5 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getWaitingTime();
        int int17 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime(10);
        int int11 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', 52);
        processDetails3.setBurstTime(97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getWaitingTime();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(32);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, (int) '#');
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getBurstTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getBurstTime();
        java.lang.String str6 = processDetails3.getProcessId();
        java.lang.String str7 = processDetails3.getProcessId();
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setWaitingTime((int) (short) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int14 = processDetails3.getWaitingTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(1);
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) -1);
        processDetails3.setBurstTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (short) 0);
        processDetails3.setArrivalTime(0);
        processDetails3.setWaitingTime((int) (short) -1);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) '4');
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setArrivalTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) '#');
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(1);
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        int int16 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (short) 10);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', 1);
        processDetails3.setWaitingTime((int) (short) 0);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, (int) (short) 10);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        int int15 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) 'a');
        int int18 = processDetails3.getWaitingTime();
        java.lang.String str19 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) 100);
        int int22 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '4', 32);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (short) 1);
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setBurstTime((int) (byte) 0);
        int int17 = processDetails3.getBurstTime();
        int int18 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(52);
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        java.lang.String str16 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(1);
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setArrivalTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(0);
        int int14 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) 100);
        int int4 = processDetails3.getArrivalTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 97);
        processDetails3.setTurnAroundTimeTime(1);
        processDetails3.setWaitingTime(0);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) '#');
        java.lang.String str14 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(1);
        processDetails3.setProcessId("");
        int int19 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        processDetails3.setWaitingTime((int) '#');
        int int17 = processDetails3.getBurstTime();
        int int18 = processDetails3.getWaitingTime();
        java.lang.String str19 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int24 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int15 = processDetails3.getBurstTime();
        java.lang.String str16 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(97);
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int21 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime((int) 'a');
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        int int17 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime((int) (short) -1);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setBurstTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setTurnAroundTimeTime((int) 'a');
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (short) 0);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setBurstTime(10);
        java.lang.String str17 = processDetails3.getProcessId();
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(97);
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        int int15 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(10);
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setArrivalTime((int) ' ');
        int int12 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) -1, (int) ' ');
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(97);
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(32);
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, (int) (byte) 0);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        java.lang.String str4 = processDetails3.getProcessId();
        int int5 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(1);
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(0);
        processDetails3.setBurstTime((int) '4');
        int int16 = processDetails3.getBurstTime();
        java.lang.String str17 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass18 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, 0);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(35);
        processDetails3.setWaitingTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setBurstTime((int) (short) 100);
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setWaitingTime(100);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        processDetails3.setWaitingTime((int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, 35);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(0);
        java.lang.String str18 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) '#');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (short) 0);
        processDetails3.setArrivalTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime((-1));
        int int11 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getWaitingTime();
        java.lang.String str16 = processDetails3.getProcessId();
        int int17 = processDetails3.getArrivalTime();
        int int18 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (-1));
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (short) 10);
        java.lang.String str10 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setWaitingTime((int) (byte) 10);
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((-1));
        processDetails3.setBurstTime(1);
        processDetails3.setBurstTime(100);
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setWaitingTime(10);
        processDetails3.setWaitingTime(32);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        int int15 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setBurstTime((int) (byte) 0);
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '4', 1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), 35);
        processDetails3.setProcessId("");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        int int8 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(10);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(97);
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setBurstTime((int) (short) 10);
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setWaitingTime((int) (short) -1);
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, (int) (byte) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setWaitingTime((int) ' ');
        int int9 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(10);
        processDetails3.setBurstTime((int) 'a');
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(1);
        processDetails3.setTurnAroundTimeTime(35);
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(97);
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '#');
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str14 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) 100);
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) '4');
        int int21 = processDetails3.getWaitingTime();
        int int22 = processDetails3.getBurstTime();
        java.lang.String str23 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime((int) (byte) -1);
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        int int15 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setArrivalTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (byte) -1);
        int int26 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) 'a');
        java.lang.Class<?> wildcardClass18 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int14 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(97);
        int int13 = processDetails3.getWaitingTime();
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (short) 0);
        processDetails3.setArrivalTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime((-1));
        int int11 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) '4');
        processDetails3.setWaitingTime(1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, (int) ' ');
        int int4 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass5 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (-1));
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(1);
        processDetails3.setArrivalTime((int) (byte) -1);
        int int21 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setWaitingTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setWaitingTime(0);
        int int24 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) 'a');
        int int12 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str11 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(10);
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getWaitingTime();
        int int17 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(32);
        int int20 = processDetails3.getWaitingTime();
        int int21 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setBurstTime((int) (byte) 0);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(0);
        processDetails3.setBurstTime((int) '4');
        int int16 = processDetails3.getBurstTime();
        int int17 = processDetails3.getArrivalTime();
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setArrivalTime((int) (byte) 10);
        int int18 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(100);
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (byte) 100);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (byte) 10);
        java.lang.String str4 = processDetails3.getProcessId();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setTurnAroundTimeTime((int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), 35);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int17 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setWaitingTime((int) (short) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        processDetails3.setWaitingTime(97);
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) 10);
        int int19 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getBurstTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        int int19 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setWaitingTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getBurstTime();
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        int int8 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setWaitingTime(0);
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) '4');
        int int4 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass5 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((-1));
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, (int) (short) 0);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((-1));
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), (int) (short) 10);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((-1));
        processDetails3.setArrivalTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) ' ');
        int int17 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (short) 1);
        java.lang.String str22 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, 0);
        int int4 = processDetails3.getArrivalTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(100);
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) -1, 10);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime(1);
        java.lang.String str20 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass21 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime(10);
        java.lang.String str15 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (byte) -1);
        processDetails3.setWaitingTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 10, (int) (byte) -1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) 'a');
        java.lang.String str7 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, (int) (short) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(1);
        int int7 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        processDetails3.setArrivalTime((int) (short) -1);
        int int15 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setBurstTime((int) (byte) -1);
        processDetails3.setBurstTime(97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', (int) (byte) 1);
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 1, (int) '#');
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 100);
        java.lang.String str13 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(35);
        int int12 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '4', 1);
        processDetails3.setArrivalTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime((-1));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime(97);
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 100);
        processDetails3.setProcessId("hi!");
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setBurstTime(35);
        java.lang.Class<?> wildcardClass18 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getBurstTime();
        int int17 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getBurstTime();
        java.lang.String str6 = processDetails3.getProcessId();
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 1, 35);
        processDetails3.setTurnAroundTimeTime(35);
        processDetails3.setBurstTime((int) (short) 100);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setArrivalTime((int) (byte) 10);
        int int18 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(0);
        int int21 = processDetails3.getArrivalTime();
        int int22 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((int) '4');
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) 'a');
        int int11 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, (int) '4');
        processDetails3.setTurnAroundTimeTime(97);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setWaitingTime((int) (short) -1);
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) ' ');
        int int17 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        int int20 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(97);
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (short) 100);
        int int13 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(35);
        processDetails3.setWaitingTime(52);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) (short) 10);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(35);
        processDetails3.setBurstTime(97);
        int int9 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setWaitingTime((int) (short) 1);
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getWaitingTime();
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        processDetails3.setWaitingTime((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setWaitingTime((int) (short) 1);
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getWaitingTime();
        int int17 = processDetails3.getWaitingTime();
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime(0);
        int int19 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setWaitingTime(32);
        processDetails3.setWaitingTime((int) 'a');
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(10);
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) '4');
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getBurstTime();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getBurstTime();
        int int17 = processDetails3.getBurstTime();
        int int18 = processDetails3.getWaitingTime();
        int int19 = processDetails3.getWaitingTime();
        int int20 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        processDetails3.setBurstTime(32);
        int int25 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) (short) -1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setArrivalTime(52);
        processDetails3.setBurstTime(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 10);
        processDetails3.setBurstTime(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(52);
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 97);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) '4');
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, (-1));
        java.lang.String str4 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass5 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getBurstTime();
        int int17 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        int int20 = processDetails3.getBurstTime();
        java.lang.String str21 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        int int10 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 100, 0);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getArrivalTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (byte) 10);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) '#');
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((-1));
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setArrivalTime(0);
        processDetails3.setTurnAroundTimeTime(35);
        int int11 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, 35);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) 10);
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 52);
        processDetails3.setTurnAroundTimeTime(32);
        java.lang.String str6 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime(10);
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setWaitingTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 32);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(35);
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getBurstTime();
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        int int9 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass10 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setArrivalTime(35);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (short) 1);
        int int4 = processDetails3.getArrivalTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (short) 0);
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', 52);
        int int4 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(52);
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getArrivalTime();
        int int17 = processDetails3.getTurnAroundTimeTime();
        int int18 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setBurstTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (short) 10);
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setBurstTime((int) (byte) 0);
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setBurstTime(100);
        processDetails3.setBurstTime((int) (byte) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        processDetails3.setWaitingTime((int) '#');
        int int17 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(97);
        processDetails3.setArrivalTime((int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setBurstTime(97);
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, (int) '#');
        processDetails3.setWaitingTime((int) (byte) 0);
        int int6 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(10);
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 100, (int) (byte) 0);
        processDetails3.setTurnAroundTimeTime((int) 'a');
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int10 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
    }
}

