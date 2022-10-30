package entities;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(0);
        processDetails3.setBurstTime((int) (short) 100);
        int int15 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(100);
        processDetails3.setArrivalTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(1);
        processDetails3.setTurnAroundTimeTime(35);
        int int12 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 10);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int10 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(32);
        int int19 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, (int) '4');
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        int int20 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 100);
        processDetails3.setProcessId("hi!");
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) 'a');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        int int16 = processDetails3.getArrivalTime();
        java.lang.String str17 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, 32);
        processDetails3.setTurnAroundTimeTime(97);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (short) 0);
        processDetails3.setArrivalTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime((-1));
        int int11 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) '#');
        int int14 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        int int22 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(0);
        int int19 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setArrivalTime((int) (short) 100);
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setBurstTime(0);
        processDetails3.setProcessId("hi!");
        java.lang.String str19 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime(1);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setWaitingTime((-1));
        int int14 = processDetails3.getWaitingTime();
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, (int) (short) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(1);
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setBurstTime((int) '#');
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (byte) 10);
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setWaitingTime((int) 'a');
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, (int) (short) -1);
        processDetails3.setBurstTime(0);
        processDetails3.setArrivalTime((int) (short) 100);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) ' ');
        int int17 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        java.lang.String str20 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', (int) 'a');
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setArrivalTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setArrivalTime((int) (byte) 100);
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(97);
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(10);
        int int14 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        int int17 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(35);
        processDetails3.setBurstTime((-1));
        processDetails3.setProcessId("");
        int int14 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), 10);
        processDetails3.setWaitingTime((int) ' ');
        int int6 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(0);
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) 'a');
        processDetails3.setArrivalTime((int) (short) -1);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getArrivalTime();
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setTurnAroundTimeTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 0);
        processDetails3.setWaitingTime(32);
        processDetails3.setBurstTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) 'a');
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 10, 97);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(35);
        processDetails3.setWaitingTime(52);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (short) -1);
        processDetails3.setWaitingTime((int) (byte) 0);
        processDetails3.setArrivalTime((int) (short) 10);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime(10);
        java.lang.String str15 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) '#');
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (byte) 10);
        java.lang.String str12 = processDetails3.getProcessId();
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setArrivalTime(1);
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((-1));
        java.lang.String str10 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(52);
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) 'a', 100);
        processDetails3.setBurstTime((int) (short) 10);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, (int) (byte) 1);
        int int4 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(97);
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(100);
        processDetails3.setBurstTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setArrivalTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, (int) ' ');
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 0);
        processDetails3.setWaitingTime(32);
        processDetails3.setBurstTime(0);
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), (int) (short) 10);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) 'a');
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) '#');
        processDetails3.setBurstTime(0);
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (short) 1);
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setArrivalTime(0);
        int int9 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int18 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int6 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str7 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setBurstTime((int) 'a');
        int int20 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setWaitingTime((int) '#');
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 10);
        processDetails3.setWaitingTime((int) (byte) 10);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(10);
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) '4');
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (short) 0);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setBurstTime(1);
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (byte) 0);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        int int17 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '#', 1);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (short) 1);
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (byte) 0);
        processDetails3.setWaitingTime(97);
        processDetails3.setBurstTime((int) '4');
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int17 = processDetails3.getArrivalTime();
        int int18 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int16 = processDetails3.getArrivalTime();
        java.lang.String str17 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setWaitingTime(0);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(35);
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 100, (int) (byte) 1);
        processDetails3.setArrivalTime((int) 'a');
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(32);
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, 32);
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, (int) (byte) 10);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setBurstTime((int) 'a');
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        int int8 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(52);
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setArrivalTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setArrivalTime(32);
        java.lang.String str21 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(1);
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setTurnAroundTimeTime(100);
        int int16 = processDetails3.getArrivalTime();
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 1);
        processDetails3.setWaitingTime(52);
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) 'a');
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setArrivalTime(0);
        processDetails3.setWaitingTime(32);
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        processDetails3.setBurstTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 32, (int) (byte) 0);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 0);
        processDetails3.setProcessId("hi!");
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(10);
        java.lang.String str14 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(0);
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 97);
        processDetails3.setBurstTime(0);
        processDetails3.setBurstTime((int) (byte) -1);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) '4');
        processDetails3.setArrivalTime(1);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((-1));
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, 0);
        processDetails3.setWaitingTime((int) ' ');
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (byte) 10);
        int int4 = processDetails3.getArrivalTime();
        java.lang.String str5 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(0);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) (byte) 100);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) 'a', (int) (byte) 1);
        processDetails3.setWaitingTime((int) (byte) 1);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setArrivalTime(1);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) 'a');
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        processDetails3.setArrivalTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(35);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (-1));
        processDetails3.setWaitingTime(100);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int12 = processDetails3.getArrivalTime();
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        java.lang.String str17 = processDetails3.getProcessId();
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(97);
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(100);
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        int int15 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) 'a');
        int int18 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str19 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setWaitingTime(97);
        int int15 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int18 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        int int21 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setArrivalTime(1);
        processDetails3.setWaitingTime((int) 'a');
        processDetails3.setProcessId("");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setProcessId("");
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(1);
        processDetails3.setBurstTime((int) '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, (int) '4');
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, 35);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        int int17 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getArrivalTime();
        java.lang.String str9 = processDetails3.getProcessId();
        java.lang.String str10 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setProcessId("hi!");
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', 100);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getBurstTime();
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setProcessId("");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) '#');
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setWaitingTime(97);
        processDetails3.setBurstTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) (byte) 100);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) 'a');
        int int9 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getArrivalTime();
        int int17 = processDetails3.getWaitingTime();
        int int18 = processDetails3.getBurstTime();
        int int19 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 100);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 100);
        processDetails3.setBurstTime((int) ' ');
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setWaitingTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setBurstTime(52);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        int int18 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '#', 0);
        int int4 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("");
        int int10 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime(1);
        int int9 = processDetails3.getArrivalTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setBurstTime(0);
        int int8 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        processDetails3.setTurnAroundTimeTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 100);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        java.lang.String str7 = processDetails3.getProcessId();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime(10);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        java.lang.String str22 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, (int) '4');
        processDetails3.setBurstTime(0);
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(35);
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setArrivalTime(0);
        int int15 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        java.lang.String str16 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(52);
        processDetails3.setArrivalTime((int) ' ');
        int int21 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) (byte) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        int int7 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(10);
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime(1);
        processDetails3.setBurstTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime((int) '#');
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setArrivalTime((int) (byte) -1);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((-1));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, (int) (byte) 10);
        processDetails3.setArrivalTime((int) (byte) 0);
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (-1));
        processDetails3.setArrivalTime(1);
        int int6 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        processDetails3.setBurstTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) -1);
        processDetails3.setArrivalTime(97);
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 52, 100);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime((int) (short) 1);
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setArrivalTime((int) (byte) 100);
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(97);
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) '#');
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) '4');
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(10);
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, (int) (short) 10);
        processDetails3.setWaitingTime((int) (byte) 1);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setProcessId("");
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (short) 10);
        processDetails3.setBurstTime((int) (short) 1);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int9 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) '#');
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) '#');
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 0);
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setBurstTime(1);
        processDetails3.setArrivalTime((int) '4');
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), (int) '4');
        java.lang.String str4 = processDetails3.getProcessId();
        int int5 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 100);
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(97);
        int int19 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(0);
        processDetails3.setProcessId("");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) 1);
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        java.lang.String str12 = processDetails3.getProcessId();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setBurstTime(0);
        java.lang.String str16 = processDetails3.getProcessId();
        int int17 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setBurstTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) (short) 0);
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(10);
        int int8 = processDetails3.getArrivalTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setBurstTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 35);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setArrivalTime((int) (byte) 100);
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(97);
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(52);
        processDetails3.setProcessId("");
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str14 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) 100);
        java.lang.String str17 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(52);
        processDetails3.setWaitingTime((int) (short) 0);
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '4', (int) (short) 1);
        int int4 = processDetails3.getArrivalTime();
        java.lang.String str5 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(0);
        processDetails3.setBurstTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) 'a');
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) '#');
        int int7 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setWaitingTime((int) (byte) 0);
        java.lang.String str12 = processDetails3.getProcessId();
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '4', 97);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        java.lang.String str7 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getArrivalTime();
        java.lang.String str7 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, 1);
        processDetails3.setArrivalTime((int) (short) 100);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (short) 10);
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        int int11 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 100);
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getArrivalTime();
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
        processDetails3.setBurstTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, 100);
        processDetails3.setArrivalTime((int) (byte) 0);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
        java.lang.String str24 = processDetails3.getProcessId();
        int int25 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) -1, 97);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setWaitingTime(10);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((-1));
        int int9 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (short) 1);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, 35);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(10);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 100);
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (byte) -1);
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        processDetails3.setWaitingTime(1);
        java.lang.String str14 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 10);
        java.lang.String str19 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (byte) -1);
        processDetails3.setWaitingTime(35);
        processDetails3.setProcessId("hi!");
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(97);
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, (int) ' ');
        processDetails3.setWaitingTime(97);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(1);
        java.lang.String str16 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        int int19 = processDetails3.getBurstTime();
        int int20 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 0);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str25 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass26 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (short) 10);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(100);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setWaitingTime(10);
        processDetails3.setArrivalTime((int) '4');
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        java.lang.String str18 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (byte) 10);
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setArrivalTime((int) (short) -1);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setProcessId("hi!");
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) -1);
        processDetails3.setArrivalTime(32);
        processDetails3.setBurstTime((int) (short) 0);
        processDetails3.setArrivalTime(52);
        int int17 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) -1);
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (short) 1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (short) 0);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setBurstTime(1);
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setTurnAroundTimeTime(32);
        int int19 = processDetails3.getArrivalTime();
        java.lang.String str20 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime((-1));
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime(1);
        processDetails3.setTurnAroundTimeTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setProcessId("");
        int int21 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime(10);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setWaitingTime(35);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setWaitingTime(35);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setArrivalTime((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, 0);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) 10);
        processDetails3.setWaitingTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 97);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setProcessId("");
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        processDetails3.setArrivalTime((int) (short) 0);
        int int19 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        int int22 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (byte) 0);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (short) 0);
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) '#');
        processDetails3.setWaitingTime(0);
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setArrivalTime((int) (byte) -1);
        int int14 = processDetails3.getWaitingTime();
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) 'a');
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, 0);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setBurstTime((int) '#');
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) -1, (int) (short) 0);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 32, (int) (byte) 100);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(97);
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setArrivalTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (short) 100);
        processDetails3.setBurstTime(35);
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(1);
        int int19 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 1);
        processDetails3.setWaitingTime(52);
        int int6 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str7 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        processDetails3.setWaitingTime((int) (byte) 100);
        java.lang.String str17 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (short) 10);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) -1, 0);
        processDetails3.setArrivalTime((int) '#');
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        int int17 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 97);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(10);
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(52);
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, (int) 'a');
        processDetails3.setBurstTime((int) '#');
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 0);
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        int int11 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) 0);
        processDetails3.setBurstTime((int) (byte) 0);
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) ' ');
        int int17 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime(10);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(100);
        int int15 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(1);
        int int18 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) -1);
        processDetails3.setArrivalTime(32);
        processDetails3.setBurstTime((int) (short) 0);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, (int) (byte) 100);
        processDetails3.setProcessId("");
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getArrivalTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setBurstTime((int) (byte) 0);
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        java.lang.String str16 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime(97);
        processDetails3.setArrivalTime((int) (byte) 0);
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 0);
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) -1, 0);
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 100);
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) '#');
        int int7 = processDetails3.getArrivalTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setArrivalTime((int) (byte) 1);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        int int7 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) -1);
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setBurstTime((int) (short) 10);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 1);
        processDetails3.setWaitingTime(52);
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str10 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int16 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) ' ');
        int int17 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        java.lang.String str20 = processDetails3.getProcessId();
        java.lang.String str21 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        java.lang.String str12 = processDetails3.getProcessId();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setBurstTime(0);
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 100);
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, 1);
        processDetails3.setArrivalTime(100);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(32);
        processDetails3.setArrivalTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(35);
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(97);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) '4');
        int int4 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, (int) (byte) 0);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(52);
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (short) 1);
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setTurnAroundTimeTime(100);
        int int16 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(35);
        processDetails3.setWaitingTime(52);
        processDetails3.setWaitingTime(1);
        processDetails3.setArrivalTime(52);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) '#');
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, (int) (byte) 1);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(10);
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setWaitingTime(10);
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (short) 0);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setBurstTime(1);
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 0);
        processDetails3.setTurnAroundTimeTime((-1));
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setProcessId("");
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 10);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', (int) 'a');
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 10, (int) '#');
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setBurstTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (byte) 0);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setArrivalTime((-1));
        processDetails3.setBurstTime((int) (short) 0);
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
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
        java.lang.String str17 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
        processDetails3.setBurstTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime(1);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (byte) 10);
        processDetails3.setBurstTime(10);
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setProcessId("");
        int int15 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setWaitingTime(97);
        int int15 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, 32);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) ' ');
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int20 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) 1);
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) 1);
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime(97);
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', (int) (byte) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, (int) (short) 10);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(97);
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((-1));
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(32);
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
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
        java.lang.String str17 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), (int) (byte) 0);
        processDetails3.setArrivalTime(97);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        java.lang.String str7 = processDetails3.getProcessId();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        processDetails3.setWaitingTime((int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setBurstTime((int) (byte) 10);
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        int int13 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (byte) 100);
        java.lang.String str18 = processDetails3.getProcessId();
        int int19 = processDetails3.getWaitingTime();
        int int20 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setArrivalTime(0);
        int int16 = processDetails3.getTurnAroundTimeTime();
        int int17 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime(0);
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        java.lang.String str16 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        int int13 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) 100);
        int int16 = processDetails3.getArrivalTime();
        int int17 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', (int) (short) 10);
        processDetails3.setWaitingTime(0);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        int int18 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        java.lang.String str19 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getArrivalTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(32);
        java.lang.String str11 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) 'a');
        int int15 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setProcessId("");
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getArrivalTime();
        java.lang.String str10 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) 'a');
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setWaitingTime((int) ' ');
        int int8 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(0);
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((-1));
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(1);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) '4');
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(52);
        java.lang.String str15 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(1);
        processDetails3.setBurstTime((int) (byte) 1);
        java.lang.String str20 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(10);
        processDetails3.setBurstTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(35);
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setTurnAroundTimeTime(32);
        int int20 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(0);
        java.lang.String str15 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
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
        processDetails3.setProcessId("hi!");
        java.lang.Class<?> wildcardClass21 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(1);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, 10);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setBurstTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 100);
        processDetails3.setArrivalTime(0);
        processDetails3.setTurnAroundTimeTime(10);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) ' ');
        int int17 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("");
        int int22 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass23 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str14 = processDetails3.getProcessId();
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((-1));
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str7 = processDetails3.getProcessId();
        int int8 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        processDetails3.setWaitingTime(0);
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (byte) -1);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setBurstTime((int) '#');
        processDetails3.setWaitingTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setWaitingTime((int) '4');
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) '4');
        java.lang.String str9 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (-1));
        processDetails3.setWaitingTime(100);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        int int9 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setBurstTime(0);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, 35);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 1);
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 1, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setBurstTime((-1));
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setBurstTime((int) (byte) 0);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) ' ');
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setBurstTime((int) '#');
        java.lang.String str12 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) '#');
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '#', 0);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) '#');
        int int7 = processDetails3.getArrivalTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setArrivalTime((int) 'a');
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(35);
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 52, (int) (short) -1);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setArrivalTime(0);
        processDetails3.setTurnAroundTimeTime(35);
        processDetails3.setArrivalTime((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setBurstTime((int) (short) 10);
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getWaitingTime();
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 10, 35);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) -1);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((-1));
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(52);
        int int20 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        int int20 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(0);
        int int16 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((-1));
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (byte) 10);
        processDetails3.setWaitingTime(10);
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (byte) 10);
        processDetails3.setBurstTime(10);
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        int int18 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int21 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(1);
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        int int19 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
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
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass21 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) '#');
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setArrivalTime((int) (byte) 100);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int6 = processDetails3.getWaitingTime();
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (byte) -1);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setWaitingTime(10);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime(52);
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(32);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setArrivalTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (short) 1);
        int int4 = processDetails3.getArrivalTime();
        java.lang.String str5 = processDetails3.getProcessId();
        java.lang.String str6 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (short) 100);
        java.lang.String str7 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, 100);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) '4');
        processDetails3.setWaitingTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (byte) -1);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setArrivalTime((int) (byte) 0);
        int int14 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
        int int21 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) (short) 100);
        processDetails3.setArrivalTime((int) (byte) 100);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, (int) '#');
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 100);
        processDetails3.setArrivalTime((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        int int18 = processDetails3.getWaitingTime();
        int int19 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        int int22 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(35);
        processDetails3.setProcessId("hi!");
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 100);
        processDetails3.setWaitingTime((int) '4');
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) -1, (int) (short) -1);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(1);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 97);
        int int4 = processDetails3.getArrivalTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        java.lang.String str4 = processDetails3.getProcessId();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setArrivalTime((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, 97);
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (-1));
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, 0);
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setArrivalTime((int) (byte) 10);
        int int8 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        processDetails3.setBurstTime((int) (short) 10);
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) (byte) 100);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(35);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setWaitingTime(35);
        java.lang.String str17 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setWaitingTime((int) (byte) 0);
        int int6 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getBurstTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int16 = processDetails3.getTurnAroundTimeTime();
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getWaitingTime();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setArrivalTime((int) (byte) 100);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        processDetails3.setProcessId("hi!");
        int int25 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 0);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        int int24 = processDetails3.getArrivalTime();
        int int25 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (-1));
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setBurstTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getWaitingTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }
}

