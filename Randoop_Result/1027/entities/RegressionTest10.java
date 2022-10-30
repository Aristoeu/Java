package entities;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setWaitingTime((int) (short) -1);
        int int15 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(1);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) 10);
        processDetails3.setBurstTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', (int) (short) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) -1, 10);
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int15 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) '#');
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime(10);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(100);
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, 0);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int6 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) (byte) 10);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
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
        processDetails3.setWaitingTime((int) (byte) 1);
        java.lang.String str22 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setWaitingTime((int) ' ');
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setBurstTime(1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
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
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int19 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 100, (int) '4');
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setWaitingTime(32);
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((-1));
        processDetails3.setWaitingTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setBurstTime(0);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (-1));
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((-1));
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(0);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setBurstTime(0);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 97);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
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
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setProcessId("hi!");
        int int22 = processDetails3.getBurstTime();
        int int23 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 100, (int) '4');
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setWaitingTime(32);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setWaitingTime(97);
        processDetails3.setBurstTime((int) (short) -1);
        int int19 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) '4');
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setArrivalTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, (int) (byte) 10);
        processDetails3.setArrivalTime((int) (byte) 0);
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setWaitingTime(35);
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) (byte) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        processDetails3.setBurstTime((int) (byte) -1);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setWaitingTime(32);
        processDetails3.setArrivalTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime(10);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) ' ');
        int int17 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setTurnAroundTimeTime(1);
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '#', (int) '#');
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
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
        int int20 = processDetails3.getBurstTime();
        int int21 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) '4');
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 0, (int) (byte) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setProcessId("");
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setProcessId("");
        int int19 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getWaitingTime();
        int int15 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setArrivalTime((int) (short) 1);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(10);
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) 'a');
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
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
        java.lang.Class<?> wildcardClass18 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        int int9 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, 0);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
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
        processDetails3.setWaitingTime(0);
        int int20 = processDetails3.getArrivalTime();
        int int21 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) '#');
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 0);
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, (int) '#');
        processDetails3.setArrivalTime(35);
        processDetails3.setWaitingTime((int) (short) 0);
        int int8 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 100, 0);
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setWaitingTime((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) '4');
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (short) 1);
        int int9 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setBurstTime(100);
        processDetails3.setWaitingTime((int) '4');
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
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
        int int20 = processDetails3.getArrivalTime();
        java.lang.String str21 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
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
        int int20 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(1);
        java.lang.String str11 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        int int15 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setProcessId("");
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setArrivalTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) ' ');
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setBurstTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, (int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setArrivalTime((int) (short) 0);
        int int8 = processDetails3.getArrivalTime();
        java.lang.String str9 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
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
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setTurnAroundTimeTime((-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 100);
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setWaitingTime((int) (byte) 0);
        int int6 = processDetails3.getWaitingTime();
        java.lang.String str7 = processDetails3.getProcessId();
        int int8 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(0);
        processDetails3.setBurstTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (short) 10);
        int int17 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(10);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(97);
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
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
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        java.lang.String str23 = processDetails3.getProcessId();
        int int24 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((-1));
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
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
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        java.lang.String str4 = processDetails3.getProcessId();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) 1);
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getWaitingTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, 1);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) 'a');
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setWaitingTime((int) (byte) 10);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(10);
        processDetails3.setProcessId("");
        int int15 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
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
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime((int) '4');
        int int23 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 1, 52);
        processDetails3.setBurstTime(32);
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (short) 0);
        java.lang.String str17 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
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
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 97);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
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
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        java.lang.String str12 = processDetails3.getProcessId();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setBurstTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), (int) (short) 1);
        processDetails3.setTurnAroundTimeTime(35);
        int int6 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
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
        int int25 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setBurstTime((-1));
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((-1));
        processDetails3.setProcessId("");
        int int16 = processDetails3.getWaitingTime();
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setTurnAroundTimeTime(1);
        processDetails3.setArrivalTime((-1));
        int int20 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', (int) (short) 0);
        processDetails3.setArrivalTime(35);
        processDetails3.setBurstTime(52);
        processDetails3.setBurstTime((int) (short) -1);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
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
        processDetails3.setArrivalTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(35);
        java.lang.String str12 = processDetails3.getProcessId();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) '4');
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int7 = processDetails3.getArrivalTime();
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getBurstTime();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setBurstTime(52);
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("hi!");
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setProcessId("");
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(0);
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
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
        processDetails3.setBurstTime((int) 'a');
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(10);
        int int14 = processDetails3.getArrivalTime();
        java.lang.String str15 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (short) 10);
        int int4 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, (int) (short) 1);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', (int) (short) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setBurstTime((int) (byte) 0);
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setBurstTime(10);
        processDetails3.setArrivalTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(52);
        int int12 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) 10);
        processDetails3.setWaitingTime(1);
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) 0);
        int int9 = processDetails3.getWaitingTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setBurstTime((-1));
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 1, (int) (short) -1);
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', (-1));
        processDetails3.setProcessId("");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) 'a');
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 10);
        int int4 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, (int) (byte) 100);
        processDetails3.setArrivalTime((int) '4');
        processDetails3.setArrivalTime(1);
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) ' ');
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
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
        int int23 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (short) 0);
        processDetails3.setArrivalTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) 10);
        int int9 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(97);
        int int8 = processDetails3.getArrivalTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getArrivalTime();
        java.lang.String str11 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setArrivalTime(52);
        processDetails3.setArrivalTime((int) (byte) 1);
        processDetails3.setWaitingTime(32);
        processDetails3.setWaitingTime((int) (byte) 10);
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 0);
        processDetails3.setProcessId("hi!");
        int int17 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
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
        int int18 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) '#');
        int int11 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(52);
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
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
        processDetails3.setWaitingTime((int) (byte) 10);
        int int19 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
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
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime(10);
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(100);
        int int15 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        processDetails3.setArrivalTime(0);
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, 35);
        processDetails3.setProcessId("");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (byte) -1);
        processDetails3.setArrivalTime(97);
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(10);
        processDetails3.setArrivalTime(1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
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
        java.lang.String str20 = processDetails3.getProcessId();
        int int21 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
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
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setArrivalTime(52);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        int int8 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setWaitingTime(0);
        processDetails3.setTurnAroundTimeTime(32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) -1, 0);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 0);
        java.lang.String str7 = processDetails3.getProcessId();
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(35);
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 10, (int) (byte) 0);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) '4');
        int int7 = processDetails3.getArrivalTime();
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        java.lang.String str10 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) '4');
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(1);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 0);
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(97);
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setArrivalTime((int) '4');
        processDetails3.setBurstTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((-1));
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime(1);
        int int18 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(1);
        processDetails3.setBurstTime(97);
        int int18 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setWaitingTime(10);
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setWaitingTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (short) 1);
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) 'a', 100);
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (byte) 10);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(100);
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setWaitingTime(0);
        int int21 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setWaitingTime(0);
        processDetails3.setBurstTime(0);
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
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
        int int18 = processDetails3.getWaitingTime();
        int int19 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) ' ');
        int int22 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        processDetails3.setArrivalTime((int) (byte) 100);
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) '4');
        processDetails3.setBurstTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 0);
        processDetails3.setArrivalTime(10);
        processDetails3.setArrivalTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(35);
        processDetails3.setWaitingTime(52);
        processDetails3.setWaitingTime(1);
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int19 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
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
        processDetails3.setBurstTime(1);
        java.lang.Class<?> wildcardClass21 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, (int) (short) 0);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setBurstTime((int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 100);
        int int19 = processDetails3.getWaitingTime();
        int int20 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        processDetails3.setWaitingTime((int) (byte) 1);
        int int17 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((-1));
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int8 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 35, 0);
        processDetails3.setArrivalTime((int) (byte) 1);
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int12 = processDetails3.getArrivalTime();
        java.lang.String str13 = processDetails3.getProcessId();
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 52);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime(10);
        int int9 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, 32);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '#');
        java.lang.String str7 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, (int) (byte) 100);
        processDetails3.setArrivalTime((int) '4');
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, 32);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((-1));
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getWaitingTime();
        int int15 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 1, (int) '4');
        processDetails3.setWaitingTime((-1));
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setBurstTime((-1));
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (byte) 100);
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (byte) 0);
        processDetails3.setWaitingTime(97);
        processDetails3.setWaitingTime((int) (short) -1);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        int int15 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str16 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (byte) 10);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((-1));
        java.lang.String str9 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setWaitingTime(32);
        java.lang.Class<?> wildcardClass20 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
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
        java.lang.String str17 = processDetails3.getProcessId();
        int int18 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setBurstTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, 1);
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setWaitingTime(0);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setBurstTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 100);
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(0);
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) 'a');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, (int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime(10);
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setWaitingTime(35);
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str5 = processDetails3.getProcessId();
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setWaitingTime((-1));
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(10);
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setProcessId("");
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(32);
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
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
        int int18 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setBurstTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((-1));
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setWaitingTime((int) '#');
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (byte) 100);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str7 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        int int13 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (byte) 100);
        int int18 = processDetails3.getTurnAroundTimeTime();
        int int19 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setWaitingTime(0);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getArrivalTime();
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        processDetails3.setProcessId("hi!");
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 100);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(52);
        int int10 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(0);
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((-1));
        processDetails3.setArrivalTime((-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) 0);
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (byte) 10);
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setWaitingTime(100);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, (-1));
        java.lang.String str4 = processDetails3.getProcessId();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setBurstTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(32);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) -1, (int) ' ');
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setProcessId("");
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(10);
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setWaitingTime(100);
        int int17 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (byte) -1);
        processDetails3.setArrivalTime(97);
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(10);
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str15 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
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
        int int20 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass21 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setTurnAroundTimeTime(100);
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int19 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime(52);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) '4');
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '#');
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
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
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        int int26 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((int) '4');
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        java.lang.String str15 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), 35);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
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
        processDetails3.setWaitingTime((int) (byte) 1);
        int int21 = processDetails3.getBurstTime();
        int int22 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getBurstTime();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
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
        processDetails3.setBurstTime(10);
        int int24 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
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
        processDetails3.setArrivalTime((int) (short) 100);
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
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, (int) (byte) 100);
        processDetails3.setProcessId("hi!");
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (short) 0);
        processDetails3.setArrivalTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) 10);
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) 0);
        int int9 = processDetails3.getWaitingTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 32, 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) '#');
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(10);
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) '4');
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) '#');
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setArrivalTime(1);
        processDetails3.setTurnAroundTimeTime(35);
        processDetails3.setArrivalTime(32);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
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
        processDetails3.setTurnAroundTimeTime(0);
        int int21 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
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
        int int20 = processDetails3.getTurnAroundTimeTime();
        int int21 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setWaitingTime(97);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getArrivalTime();
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(100);
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(10);
        java.lang.String str9 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(10);
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setBurstTime(52);
        processDetails3.setBurstTime(100);
        processDetails3.setWaitingTime((int) (byte) 10);
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(52);
        processDetails3.setArrivalTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(32);
        int int14 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
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
        processDetails3.setArrivalTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(1);
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(100);
        processDetails3.setBurstTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 1, (int) (byte) 10);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((-1));
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setWaitingTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(35);
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
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
        int int18 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setBurstTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
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
        int int21 = processDetails3.getArrivalTime();
        int int22 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(52);
        processDetails3.setWaitingTime((int) (byte) 1);
        int int18 = processDetails3.getTurnAroundTimeTime();
        int int19 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, 0);
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        int int6 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
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
        int int17 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
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
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) '#');
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 0);
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setBurstTime((int) (short) 100);
        processDetails3.setArrivalTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
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
        java.lang.Class<?> wildcardClass18 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(0);
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(10);
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 32);
        java.lang.String str4 = processDetails3.getProcessId();
        int int5 = processDetails3.getArrivalTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setBurstTime(97);
        java.lang.String str6 = processDetails3.getProcessId();
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setBurstTime(52);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) ' ');
        int int16 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, 35);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '#', 97);
        processDetails3.setBurstTime((int) 'a');
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (short) 10);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) '4');
        java.lang.String str10 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) 'a');
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int18 = processDetails3.getTurnAroundTimeTime();
        int int19 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setBurstTime((int) (byte) 0);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setArrivalTime((int) 'a');
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 1, (int) (short) 100);
        processDetails3.setWaitingTime(0);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
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
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, (-1));
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(100);
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, 32);
        processDetails3.setProcessId("");
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
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
        processDetails3.setBurstTime((int) 'a');
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setArrivalTime(0);
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(0);
        int int19 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
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
        processDetails3.setWaitingTime(10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        java.lang.String str10 = processDetails3.getProcessId();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 1);
        int int16 = processDetails3.getArrivalTime();
        java.lang.String str17 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 100);
        int int20 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(35);
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', 0);
        processDetails3.setArrivalTime(0);
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getWaitingTime();
        java.lang.String str17 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) '4');
        int int20 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(97);
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
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
        int int16 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        int int17 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
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
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(52);
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(32);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
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
        processDetails3.setArrivalTime(0);
        int int19 = processDetails3.getArrivalTime();
        int int20 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', (int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        int int16 = processDetails3.getWaitingTime();
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(10);
        processDetails3.setWaitingTime((int) (byte) 100);
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(10);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
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
        int int19 = processDetails3.getBurstTime();
        int int20 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 32, (int) (short) 0);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime(10);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(1);
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setBurstTime(32);
        processDetails3.setWaitingTime(0);
        int int22 = processDetails3.getArrivalTime();
        int int23 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) (byte) 100);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        java.lang.String str6 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setBurstTime((int) (short) 10);
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getArrivalTime();
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((-1));
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((int) '4');
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '#');
        int int11 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setBurstTime(10);
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), (int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) (short) 1);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((-1));
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 52);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setArrivalTime((int) '4');
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 100);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(52);
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setWaitingTime((int) (short) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
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
        int int18 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((-1));
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
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
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) 'a');
        int int12 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', 1);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 1, 35);
        int int4 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass5 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
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
        processDetails3.setTurnAroundTimeTime(32);
        int int20 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((-1));
        int int23 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        int int11 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(0);
        int int19 = processDetails3.getTurnAroundTimeTime();
        int int20 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(1);
        int int18 = processDetails3.getBurstTime();
        int int19 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 32, (int) (byte) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setBurstTime(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setBurstTime((int) (byte) 0);
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) 'a');
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getWaitingTime();
        java.lang.String str15 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
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
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        int int23 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("");
        int int12 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 97);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setArrivalTime(35);
        int int10 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setBurstTime(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, (int) '#');
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 0);
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 32, 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, 35);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(0);
        processDetails3.setBurstTime((int) (short) 100);
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getBurstTime();
        int int17 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime(1);
        int int9 = processDetails3.getArrivalTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime(10);
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
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
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        int int19 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) 10);
        int int22 = processDetails3.getWaitingTime();
        int int23 = processDetails3.getArrivalTime();
        int int24 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setWaitingTime((int) (short) 100);
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        processDetails3.setWaitingTime((-1));
        processDetails3.setTurnAroundTimeTime((int) '4');
        java.lang.Class<?> wildcardClass17 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((-1));
        int int13 = processDetails3.getArrivalTime();
        java.lang.String str14 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 0);
        processDetails3.setWaitingTime(32);
        processDetails3.setBurstTime(0);
        processDetails3.setArrivalTime(10);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(32);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) (byte) 100);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        processDetails3.setWaitingTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, 0);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str10 = processDetails3.getProcessId();
        java.lang.String str11 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 52, 52);
        processDetails3.setBurstTime((int) '#');
        processDetails3.setBurstTime(35);
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, 10);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) (byte) 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int16 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setProcessId("");
        int int21 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getArrivalTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
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
        java.lang.String str18 = processDetails3.getProcessId();
        int int19 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
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
        processDetails3.setBurstTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) '#');
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (byte) 0);
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setArrivalTime((-1));
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setBurstTime(100);
        int int17 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(32);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, 100);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getArrivalTime();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setArrivalTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getWaitingTime();
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 1);
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setWaitingTime((int) (byte) 10);
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(0);
        java.lang.String str17 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
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
        processDetails3.setWaitingTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(52);
        processDetails3.setWaitingTime((int) (byte) 1);
        int int18 = processDetails3.getTurnAroundTimeTime();
        int int19 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 35);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 0);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime(97);
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        int int13 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int23 = processDetails3.getWaitingTime();
        int int24 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        java.lang.String str10 = processDetails3.getProcessId();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 1);
        processDetails3.setArrivalTime(10);
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 52);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, (int) (byte) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        processDetails3.setBurstTime((int) (byte) -1);
        processDetails3.setArrivalTime(0);
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        int int10 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(35);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setWaitingTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((-1));
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setWaitingTime((int) (byte) 10);
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((-1));
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setArrivalTime(52);
        processDetails3.setArrivalTime((int) (byte) 1);
        processDetails3.setWaitingTime(32);
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (short) 1);
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getArrivalTime();
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setTurnAroundTimeTime((int) '4');
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
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
        int int16 = processDetails3.getWaitingTime();
        java.lang.String str17 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass18 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 1);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 0, (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setBurstTime((int) (byte) 10);
        int int15 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setProcessId("");
        int int17 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int20 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (byte) 10);
        java.lang.String str4 = processDetails3.getProcessId();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (byte) -1);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (byte) 0);
        int int8 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setArrivalTime(52);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setWaitingTime((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
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
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str5 = processDetails3.getProcessId();
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setWaitingTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, (int) (short) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        processDetails3.setWaitingTime((-1));
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setBurstTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
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
        int int17 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(52);
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getBurstTime();
        java.lang.String str17 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(97);
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 0);
        processDetails3.setTurnAroundTimeTime((-1));
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
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
        int int22 = processDetails3.getBurstTime();
        int int23 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(52);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setBurstTime(0);
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 1, (int) (short) 1);
        processDetails3.setBurstTime((int) (byte) -1);
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
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
        java.lang.String str16 = processDetails3.getProcessId();
        int int17 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', 97);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
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
        java.lang.String str17 = processDetails3.getProcessId();
        int int18 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        java.lang.String str25 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(10);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setArrivalTime((int) (short) 10);
        processDetails3.setArrivalTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(100);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setProcessId("hi!");
        int int20 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass21 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setWaitingTime((int) (short) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass16 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(97);
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), (int) (byte) 100);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
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
        int int21 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 0);
        int int24 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(97);
        processDetails3.setBurstTime((int) 'a');
        processDetails3.setArrivalTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, 97);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str7 = processDetails3.getProcessId();
        int int8 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, 1);
        processDetails3.setArrivalTime((int) (byte) -1);
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getBurstTime();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }
}

