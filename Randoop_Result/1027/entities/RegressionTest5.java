package entities;

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
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', (-1));
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) -1);
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, 10);
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setArrivalTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, 10);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getArrivalTime();
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int14 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        int int17 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setArrivalTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 0);
        int int15 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, (int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        int int17 = processDetails3.getTurnAroundTimeTime();
        int int18 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setBurstTime(1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, (int) ' ');
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int19 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) 'a');
        int int15 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setArrivalTime(35);
        processDetails3.setTurnAroundTimeTime(10);
        int int19 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((-1));
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime(97);
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setWaitingTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int6 = processDetails3.getWaitingTime();
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) 'a');
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setWaitingTime(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(35);
        processDetails3.setWaitingTime((int) (short) 0);
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(100);
        int int12 = processDetails3.getArrivalTime();
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (byte) 100);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(0);
        int int17 = processDetails3.getWaitingTime();
        int int18 = processDetails3.getWaitingTime();
        int int19 = processDetails3.getWaitingTime();
        java.lang.String str20 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '#', 100);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime(1);
        processDetails3.setWaitingTime((int) (short) 100);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) ' ');
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 100);
        processDetails3.setArrivalTime(0);
        processDetails3.setWaitingTime(32);
        processDetails3.setBurstTime(1);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 1, (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        processDetails3.setArrivalTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (short) 0);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setBurstTime((int) '4');
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(52);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setProcessId("");
        int int11 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int16 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(0);
        int int19 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) '4');
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) '4');
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime((int) (byte) -1);
        int int14 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, 0);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getBurstTime();
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), 97);
        processDetails3.setArrivalTime(52);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) '4');
        processDetails3.setArrivalTime(1);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((-1));
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, (int) (short) 10);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, 0);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((-1));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) ' ');
        java.lang.Class<?> wildcardClass10 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        int int17 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) 0);
        processDetails3.setProcessId("hi!");
        java.lang.String str22 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(10);
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setWaitingTime(10);
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getWaitingTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int12 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        processDetails3.setArrivalTime((int) (byte) 100);
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(97);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(35);
        int int14 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setArrivalTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((-1));
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, (int) (short) 10);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 52);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        java.lang.String str22 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        processDetails3.setWaitingTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        java.lang.String str7 = processDetails3.getProcessId();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, 0);
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(10);
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (short) 1);
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(1);
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getBurstTime();
        java.lang.String str15 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        int int19 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) ' ');
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(32);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        processDetails3.setWaitingTime(1);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime(52);
        int int18 = processDetails3.getWaitingTime();
        int int19 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, 1);
        processDetails3.setArrivalTime((int) (byte) -1);
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(10);
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 100);
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setBurstTime(35);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setArrivalTime(35);
        int int17 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        int int15 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) 'a');
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int16 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(100);
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        java.lang.String str17 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str5 = processDetails3.getProcessId();
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setWaitingTime((-1));
        processDetails3.setWaitingTime(35);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        int int20 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setWaitingTime(32);
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (-1));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setArrivalTime(1);
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 1, (int) (byte) 10);
        int int4 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass5 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime(97);
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(10);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setBurstTime(0);
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str10 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), (int) (short) 10);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setProcessId("");
        java.lang.String str20 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setProcessId("");
        int int10 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        java.lang.String str11 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, 97);
        int int4 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        java.lang.String str15 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setWaitingTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        processDetails3.setBurstTime(32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setTurnAroundTimeTime(35);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setTurnAroundTimeTime(0);
        int int21 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        java.lang.String str10 = processDetails3.getProcessId();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((-1));
        int int14 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(100);
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int14 = processDetails3.getWaitingTime();
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setWaitingTime(97);
        int int15 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(100);
        processDetails3.setTurnAroundTimeTime((int) '4');
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setBurstTime(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (byte) 1);
        processDetails3.setWaitingTime(1);
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 100);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(52);
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        processDetails3.setWaitingTime((int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 35, 0);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, 52);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) 'a');
        int int9 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setArrivalTime((int) (byte) 100);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(35);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(10);
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        int int8 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(52);
        java.lang.Class<?> wildcardClass18 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        processDetails3.setWaitingTime((int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setTurnAroundTimeTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, 35);
        processDetails3.setProcessId("");
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, (int) (short) -1);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setArrivalTime((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) '4');
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int6 = processDetails3.getWaitingTime();
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (byte) -1);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (short) 10);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), (int) (byte) 10);
        processDetails3.setBurstTime(52);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int9 = processDetails3.getArrivalTime();
        java.lang.String str10 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setArrivalTime((int) '4');
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(97);
        processDetails3.setWaitingTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (short) 0);
        processDetails3.setArrivalTime(0);
        processDetails3.setTurnAroundTimeTime((-1));
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) 'a');
        processDetails3.setArrivalTime((int) (short) -1);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getBurstTime();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setProcessId("");
        int int11 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(0);
        int int14 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setBurstTime((int) (byte) 0);
        int int17 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, 35);
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setArrivalTime(0);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (short) 10);
        processDetails3.setBurstTime((int) (short) 1);
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setWaitingTime(97);
        int int15 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) (short) 100);
        int int20 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 100);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setBurstTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '4', (int) (short) -1);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 97);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, 0);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 97);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (short) 10);
        processDetails3.setBurstTime((int) (short) 1);
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setArrivalTime((int) '4');
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((-1));
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        java.lang.String str15 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) (short) 10);
        processDetails3.setWaitingTime((int) 'a');
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int8 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) (short) 100);
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setArrivalTime((int) '#');
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(52);
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setBurstTime(32);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 0);
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setBurstTime(97);
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) -1, 35);
        processDetails3.setWaitingTime(0);
        int int6 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime(52);
        processDetails3.setBurstTime(10);
        processDetails3.setTurnAroundTimeTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) -1);
        int int18 = processDetails3.getWaitingTime();
        java.lang.String str19 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str9 = processDetails3.getProcessId();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getWaitingTime();
        java.lang.String str16 = processDetails3.getProcessId();
        java.lang.String str17 = processDetails3.getProcessId();
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 0, 32);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, (int) '4');
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(35);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (byte) 100);
        int int8 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setWaitingTime((int) (byte) 1);
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setArrivalTime(97);
        processDetails3.setArrivalTime((int) (short) 1);
        int int12 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setBurstTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) ' ');
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) '4');
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int9 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) -1, (-1));
        processDetails3.setBurstTime(100);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setBurstTime((int) '4');
        int int23 = processDetails3.getBurstTime();
        java.lang.String str24 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) ' ');
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int15 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(0);
        int int18 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (short) 0);
        processDetails3.setArrivalTime(0);
        int int6 = processDetails3.getWaitingTime();
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) ' ');
        int int4 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(35);
        processDetails3.setWaitingTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setWaitingTime((int) (byte) 0);
        int int6 = processDetails3.getWaitingTime();
        java.lang.String str7 = processDetails3.getProcessId();
        int int8 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 0);
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setBurstTime(1);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getBurstTime();
        java.lang.String str16 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) -1);
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((-1));
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '4', 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getWaitingTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        java.lang.String str12 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, 100);
        processDetails3.setProcessId("");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setWaitingTime((-1));
        processDetails3.setArrivalTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, 35);
        processDetails3.setArrivalTime((int) (byte) 1);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(100);
        processDetails3.setArrivalTime(10);
        processDetails3.setProcessId("hi!");
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(52);
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(0);
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setWaitingTime((int) (byte) 1);
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setBurstTime(97);
        processDetails3.setWaitingTime(97);
        processDetails3.setArrivalTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) (short) -1);
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) 'a');
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setBurstTime((int) (byte) 100);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 1, (int) (short) 0);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(10);
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((-1));
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        java.lang.String str16 = processDetails3.getProcessId();
        int int17 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) -1);
        int int13 = processDetails3.getArrivalTime();
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setBurstTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) (byte) 100);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, 100);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass5 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((-1));
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int16 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        int int19 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (short) -1);
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (byte) 10);
        processDetails3.setBurstTime(10);
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, (int) '4');
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) 1);
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 0);
        processDetails3.setArrivalTime(10);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) ' ');
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (short) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 0);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), (int) (byte) -1);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (short) 10);
        processDetails3.setBurstTime((int) (short) 1);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) -1, (int) '#');
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setBurstTime((int) (short) 0);
        java.lang.String str17 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 10, 97);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(32);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) -1);
        int int16 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setArrivalTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setProcessId("");
        int int11 = processDetails3.getBurstTime();
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
        int int19 = processDetails3.getArrivalTime();
        int int20 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        java.lang.String str12 = processDetails3.getProcessId();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (short) 100);
        int int16 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(1);
        int int19 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(10);
        processDetails3.setBurstTime((int) (byte) 10);
        int int24 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getBurstTime();
        int int17 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(10);
        int int14 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 100);
        processDetails3.setArrivalTime(0);
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) -1);
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getBurstTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass10 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setWaitingTime(10);
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setArrivalTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setWaitingTime((int) (byte) 1);
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setBurstTime(97);
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) -1, 100);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 100, 1);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(100);
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setArrivalTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, (-1));
        processDetails3.setArrivalTime(0);
        processDetails3.setArrivalTime(100);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), (int) (short) 10);
        processDetails3.setWaitingTime(10);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (short) 0);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(35);
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setBurstTime((int) (short) 1);
        int int22 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str10 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, 97);
        processDetails3.setWaitingTime(0);
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        int int9 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setProcessId("hi!");
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        java.lang.String str16 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str9 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass10 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 100, 100);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime((int) ' ');
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getBurstTime();
        java.lang.String str11 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(100);
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int19 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (short) 10);
        processDetails3.setBurstTime((int) (short) 1);
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setWaitingTime((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) 'a');
        int int15 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
        int int18 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setArrivalTime((int) 'a');
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(10);
        java.lang.String str19 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass20 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, 1);
        processDetails3.setArrivalTime((int) (byte) -1);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, 0);
        int int4 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, 35);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setBurstTime((-1));
        int int9 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime(0);
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(1);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(0);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setBurstTime((int) (short) 1);
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(100);
        processDetails3.setWaitingTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        processDetails3.setWaitingTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int13 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass22 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setWaitingTime(100);
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) -1);
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        int int13 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setWaitingTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(10);
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setBurstTime(52);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(0);
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 32, (int) (byte) 1);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime(0);
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(35);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 10, (int) (byte) -1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setBurstTime(97);
        processDetails3.setProcessId("hi!");
        int int20 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(35);
        int int23 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 0, 0);
        int int4 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime(1);
        int int9 = processDetails3.getArrivalTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime(10);
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 0);
        processDetails3.setArrivalTime(10);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, 52);
        int int4 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        int int8 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), (int) (short) 1);
        processDetails3.setTurnAroundTimeTime(35);
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(1);
        processDetails3.setProcessId("hi!");
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(32);
        processDetails3.setBurstTime(97);
        java.lang.String str18 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (short) -1);
        int int21 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setProcessId("");
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setBurstTime((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getBurstTime();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getWaitingTime();
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) 'a');
        processDetails3.setArrivalTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getBurstTime();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 100);
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setWaitingTime(10);
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(35);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setWaitingTime(10);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setTurnAroundTimeTime((int) ' ');
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 32);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        int int7 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), 1);
        processDetails3.setWaitingTime((int) (byte) 0);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) '4');
        int int11 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getBurstTime();
        int int6 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setWaitingTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, (int) 'a');
        processDetails3.setArrivalTime(97);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(1);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(52);
        processDetails3.setBurstTime(35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(52);
        int int19 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(52);
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setProcessId("");
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(10);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setArrivalTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        int int15 = processDetails3.getArrivalTime();
        java.lang.String str16 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 97);
        int int4 = processDetails3.getArrivalTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int12 = processDetails3.getWaitingTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setBurstTime(10);
        processDetails3.setArrivalTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) '4');
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(1);
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, 0);
        processDetails3.setBurstTime(10);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setArrivalTime(1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int16 = processDetails3.getArrivalTime();
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (byte) -1);
        processDetails3.setArrivalTime(97);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int15 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setProcessId("");
        int int11 = processDetails3.getBurstTime();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, (int) (short) 100);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setArrivalTime(0);
        processDetails3.setTurnAroundTimeTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setBurstTime(0);
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("hi!");
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setBurstTime(35);
        int int15 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setBurstTime(97);
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setBurstTime((int) (byte) 10);
        processDetails3.setProcessId("");
        java.lang.String str19 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass20 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setWaitingTime((int) (byte) 0);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(10);
        int int8 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(10);
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) -1, 32);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (short) 1);
        processDetails3.setWaitingTime(0);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 97);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setBurstTime((-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
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
        int int16 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str17 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setArrivalTime(0);
        processDetails3.setTurnAroundTimeTime(35);
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 35, (int) (byte) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setArrivalTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 35, 10);
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, 52);
        processDetails3.setBurstTime((int) (short) 0);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
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
        java.lang.String str22 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass23 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setTurnAroundTimeTime(100);
        int int16 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str17 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass18 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int21 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (short) 0);
        processDetails3.setArrivalTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setWaitingTime((int) (byte) 10);
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setWaitingTime((int) (short) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', 0);
        java.lang.String str4 = processDetails3.getProcessId();
        int int5 = processDetails3.getBurstTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '#', 0);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', (int) (short) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int6 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getArrivalTime();
        int int17 = processDetails3.getWaitingTime();
        int int18 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setBurstTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) ' ');
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(0);
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        int int19 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setBurstTime(100);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int20 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(10);
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setProcessId("");
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((-1));
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) (short) 10);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(35);
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', 0);
        processDetails3.setArrivalTime(0);
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        java.lang.String str16 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), (-1));
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '#', (int) 'a');
        processDetails3.setArrivalTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 0);
        int int9 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(100);
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(35);
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(10);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(97);
        java.lang.String str16 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
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
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setArrivalTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(52);
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setWaitingTime((int) (short) 0);
        int int20 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) 'a', (int) (short) 100);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
        int int23 = processDetails3.getArrivalTime();
        int int24 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime(97);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setProcessId("hi!");
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 35, 32);
        processDetails3.setBurstTime((int) 'a');
        processDetails3.setArrivalTime((int) (short) 1);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int18 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) -1);
        processDetails3.setProcessId("hi!");
        java.lang.String str19 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getWaitingTime();
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        int int17 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setBurstTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setProcessId("hi!");
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime((int) (byte) -1);
        int int14 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (short) 10);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int15 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 97);
        int int4 = processDetails3.getArrivalTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str7 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '#', (int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getBurstTime();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
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
        int int17 = processDetails3.getWaitingTime();
        int int18 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 1, (int) (short) 100);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setArrivalTime(1);
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime(10);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(100);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setBurstTime(0);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 0);
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime(0);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) '4');
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(10);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 52, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), 52);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getWaitingTime();
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, (int) (short) 100);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) 100);
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) 0);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(10);
        processDetails3.setArrivalTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', 10);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int19 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) 'a');
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 97);
        java.lang.String str4 = processDetails3.getProcessId();
        int int5 = processDetails3.getBurstTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) -1, (-1));
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (short) 1);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setWaitingTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
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
        int int18 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
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
        java.lang.String str22 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, 1);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setBurstTime(35);
        processDetails3.setArrivalTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 1, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((-1));
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setWaitingTime(52);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (byte) 0);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) 'a', (int) (short) 0);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 52, 0);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) '#');
        int int15 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, (int) '#');
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) '4');
        processDetails3.setTurnAroundTimeTime((int) '4');
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
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
        processDetails3.setBurstTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getArrivalTime();
        int int17 = processDetails3.getArrivalTime();
        int int18 = processDetails3.getWaitingTime();
        int int19 = processDetails3.getArrivalTime();
        int int20 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int23 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 52, (int) 'a');
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
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
        int int19 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        int int4 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass5 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((int) '4');
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setBurstTime((int) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, 35);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(52);
        int int15 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) '4');
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) 0);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
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
        int int18 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) 10);
        int int21 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(52);
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(1);
        processDetails3.setProcessId("hi!");
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) 'a');
        processDetails3.setTurnAroundTimeTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) ' ');
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setWaitingTime(1);
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setBurstTime(100);
        processDetails3.setWaitingTime(1);
        int int18 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str19 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass20 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime(1);
        java.lang.String str17 = processDetails3.getProcessId();
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) (short) 10);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) '4');
        int int9 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass10 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', 100);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getBurstTime();
        int int6 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        java.lang.String str22 = processDetails3.getProcessId();
        int int23 = processDetails3.getBurstTime();
        int int24 = processDetails3.getArrivalTime();
        int int25 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) 'a');
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(100);
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass10 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(52);
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) -1);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) '#');
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        java.lang.String str17 = processDetails3.getProcessId();
        int int18 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(0);
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 97);
        int int4 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', 0);
        processDetails3.setArrivalTime((int) (byte) 100);
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) -1);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        java.lang.String str12 = processDetails3.getProcessId();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (short) 100);
        int int16 = processDetails3.getBurstTime();
        int int17 = processDetails3.getBurstTime();
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 100);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) -1, 97);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) 'a');
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime((int) (short) 1);
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str11 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) 'a');
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 1, 35);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) (short) 10);
        processDetails3.setWaitingTime((int) 'a');
        int int6 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        java.lang.String str4 = processDetails3.getProcessId();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(97);
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime(10);
        processDetails3.setArrivalTime((int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
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
        processDetails3.setTurnAroundTimeTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (short) 100);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) 'a');
        processDetails3.setBurstTime(52);
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((-1));
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime(97);
        int int11 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (byte) -1);
        processDetails3.setWaitingTime(35);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, (int) (byte) 100);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        int int13 = processDetails3.getBurstTime();
        java.lang.String str14 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setBurstTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 1, 52);
        int int4 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass5 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int14 = processDetails3.getWaitingTime();
        int int15 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }
}

