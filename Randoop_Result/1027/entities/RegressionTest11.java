package entities;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (short) 0);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 100);
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setArrivalTime(0);
        processDetails3.setTurnAroundTimeTime(35);
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) -1);
        processDetails3.setArrivalTime(32);
        processDetails3.setArrivalTime(35);
        processDetails3.setBurstTime((int) (short) 0);
        int int17 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) 100);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setBurstTime(52);
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
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
        int int18 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int6 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (short) 10);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(0);
        processDetails3.setBurstTime((int) (short) 100);
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '#', 10);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime((int) (short) 0);
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) '4');
        processDetails3.setArrivalTime(1);
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) (short) 1);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 100, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(32);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setWaitingTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setWaitingTime(10);
        processDetails3.setArrivalTime(1);
        processDetails3.setWaitingTime(0);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime(1);
        int int9 = processDetails3.getArrivalTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime(10);
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setWaitingTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setWaitingTime((int) (byte) -1);
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 0);
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 10);
        java.lang.String str17 = processDetails3.getProcessId();
        int int18 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 0);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(52);
        int int20 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        java.lang.String str9 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), (int) (short) 10);
        processDetails3.setArrivalTime(32);
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
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
        java.lang.Class<?> wildcardClass22 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int19 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        int int22 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime(100);
        processDetails3.setProcessId("hi!");
        java.lang.Class<?> wildcardClass18 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
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
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        java.lang.String str25 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass28 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) (short) -1);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) -1);
        processDetails3.setArrivalTime(32);
        processDetails3.setBurstTime((int) (short) 0);
        processDetails3.setArrivalTime(52);
        int int17 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, 35);
        processDetails3.setBurstTime((int) (short) 100);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((-1));
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int19 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setArrivalTime(0);
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(32);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime(35);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setBurstTime((int) '#');
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, (int) (short) 10);
        processDetails3.setBurstTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime(97);
        int int8 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(52);
        processDetails3.setWaitingTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 100, (int) '4');
        processDetails3.setWaitingTime((int) '4');
        int int6 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int6 = processDetails3.getWaitingTime();
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime(97);
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(10);
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, (int) '4');
        processDetails3.setArrivalTime((int) '4');
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setWaitingTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(32);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getWaitingTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, 35);
        processDetails3.setBurstTime((-1));
        processDetails3.setBurstTime((int) (short) 0);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, 97);
        processDetails3.setProcessId("");
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
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
        int int19 = processDetails3.getWaitingTime();
        int int20 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setArrivalTime(1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int16 = processDetails3.getArrivalTime();
        int int17 = processDetails3.getWaitingTime();
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(32);
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setArrivalTime((int) (byte) -1);
        int int22 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 100);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(52);
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '4', (int) (byte) 10);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        java.lang.String str4 = processDetails3.getProcessId();
        java.lang.String str5 = processDetails3.getProcessId();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) '#');
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getBurstTime();
        java.lang.String str6 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (short) 1);
        int int4 = processDetails3.getArrivalTime();
        java.lang.String str5 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        java.lang.String str4 = processDetails3.getProcessId();
        java.lang.String str5 = processDetails3.getProcessId();
        java.lang.String str6 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        int int8 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, 1);
        processDetails3.setArrivalTime(100);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setWaitingTime((int) (short) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setArrivalTime(10);
        int int17 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        java.lang.String str10 = processDetails3.getProcessId();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 1);
        java.lang.String str16 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
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
        java.lang.String str20 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(52);
        processDetails3.setWaitingTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 35, (int) '4');
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, 52);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
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
        processDetails3.setTurnAroundTimeTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setBurstTime((-1));
        int int14 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
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
        processDetails3.setWaitingTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
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
        int int21 = processDetails3.getTurnAroundTimeTime();
        int int22 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setBurstTime((int) (byte) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 52);
        processDetails3.setWaitingTime((int) (short) 100);
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getWaitingTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(35);
        processDetails3.setWaitingTime(52);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int15 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setBurstTime(0);
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getBurstTime();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setBurstTime(52);
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(97);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(100);
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, 0);
        int int4 = processDetails3.getArrivalTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), 32);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
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
        processDetails3.setArrivalTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(1);
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 10);
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setBurstTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '#');
        processDetails3.setArrivalTime((int) ' ');
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 100, (int) '4');
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
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
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(0);
        int int14 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(52);
        processDetails3.setArrivalTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) -1, (int) 'a');
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 100);
        processDetails3.setBurstTime(100);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) 'a');
        processDetails3.setWaitingTime((int) (short) -1);
        int int17 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 100, 0);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime(1);
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), (int) (short) 100);
        processDetails3.setBurstTime((int) (short) 100);
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((-1));
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        int int12 = processDetails3.getArrivalTime();
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setProcessId("hi!");
        int int19 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
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
        java.lang.String str18 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setWaitingTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
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
        processDetails3.setArrivalTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(100);
        processDetails3.setBurstTime((int) (byte) 100);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setBurstTime((int) (short) 1);
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str11 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) '4');
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), (int) (short) -1);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
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
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
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
        int int17 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setArrivalTime((-1));
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
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
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
        processDetails3.setBurstTime((int) ' ');
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
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getBurstTime();
        java.lang.String str11 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, 10);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(32);
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime((int) (byte) 10);
        int int10 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
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
        int int22 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
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
        int int25 = processDetails3.getTurnAroundTimeTime();
        int int26 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass27 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 100, (int) ' ');
        processDetails3.setProcessId("");
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime(10);
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) '4');
        processDetails3.setArrivalTime((int) (byte) 10);
        int int17 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setWaitingTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, (int) 'a');
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) '4');
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setArrivalTime((int) (byte) 100);
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setBurstTime(100);
        int int8 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(10);
        processDetails3.setWaitingTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(10);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) '#');
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
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
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, 10);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) ' ');
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int15 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(0);
        int int18 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(10);
        processDetails3.setBurstTime((int) 'a');
        int int10 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
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
        processDetails3.setArrivalTime(0);
        java.lang.String str19 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 32, (int) (byte) 100);
        processDetails3.setWaitingTime(35);
        int int6 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 0);
        processDetails3.setBurstTime((-1));
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getWaitingTime();
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) -1);
        processDetails3.setWaitingTime((int) (byte) 0);
        processDetails3.setWaitingTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 100);
        processDetails3.setWaitingTime((int) 'a');
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
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
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        java.lang.String str24 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(52);
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setBurstTime((int) (byte) 100);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) -1, (-1));
        processDetails3.setWaitingTime(10);
        int int6 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setBurstTime((int) (byte) 0);
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) ' ');
        int int19 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
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
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
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
        java.lang.String str24 = processDetails3.getProcessId();
        int int25 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setProcessId("");
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, (int) (byte) 10);
        processDetails3.setArrivalTime((int) (byte) 0);
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, 97);
        int int4 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setWaitingTime(10);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((-1));
        java.lang.String str9 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        processDetails3.setBurstTime(0);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(1);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
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
        int int22 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
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
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime(100);
        int int26 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getArrivalTime();
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass10 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (byte) 1);
        processDetails3.setWaitingTime(1);
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str13 = processDetails3.getProcessId();
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (short) 100);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (byte) -1);
        int int10 = processDetails3.getBurstTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) 'a');
        java.lang.String str9 = processDetails3.getProcessId();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setWaitingTime(32);
        int int18 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) 1);
        processDetails3.setBurstTime(10);
        int int23 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
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
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str18 = processDetails3.getProcessId();
        int int19 = processDetails3.getWaitingTime();
        int int20 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, (int) (short) 1);
        processDetails3.setWaitingTime(52);
        int int6 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
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
        processDetails3.setTurnAroundTimeTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(35);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
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
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setTurnAroundTimeTime(35);
        processDetails3.setTurnAroundTimeTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), 35);
        processDetails3.setWaitingTime((int) (byte) 100);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
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
        processDetails3.setBurstTime(0);
        processDetails3.setArrivalTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((-1));
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime(0);
        int int14 = processDetails3.getWaitingTime();
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setBurstTime(97);
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) (short) 1);
        processDetails3.setArrivalTime(35);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setProcessId("");
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        int int11 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 32);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, (int) (short) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 35, (int) (short) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        processDetails3.setWaitingTime((-1));
        java.lang.Class<?> wildcardClass9 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, (int) '#');
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        processDetails3.setWaitingTime((int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 1);
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime(1);
        processDetails3.setWaitingTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str16 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(1);
        int int19 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getArrivalTime();
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        int int16 = processDetails3.getArrivalTime();
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        java.lang.String str16 = processDetails3.getProcessId();
        java.lang.String str17 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(1);
        processDetails3.setProcessId("hi!");
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) 'a');
        processDetails3.setBurstTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        processDetails3.setBurstTime(32);
        java.lang.Class<?> wildcardClass15 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) '#');
        int int15 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(97);
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
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
        processDetails3.setArrivalTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, 0);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (short) 10);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime(1);
        processDetails3.setArrivalTime((int) '#');
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
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
        java.lang.String str20 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime(97);
        java.lang.String str9 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass10 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 10);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setWaitingTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, 10);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setArrivalTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
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
        java.lang.Class<?> wildcardClass19 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(10);
        java.lang.String str7 = processDetails3.getProcessId();
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), (-1));
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        java.lang.String str14 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, 32);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 0, 97);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(35);
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
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
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setWaitingTime(0);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((-1));
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) 'a');
        processDetails3.setBurstTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        int int13 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) 100);
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, 0);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str10 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, (-1));
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((-1));
        processDetails3.setArrivalTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(1);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 1, 35);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(35);
        processDetails3.setWaitingTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getArrivalTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) ' ');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setArrivalTime((int) ' ');
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) '4');
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        java.lang.String str4 = processDetails3.getProcessId();
        int int5 = processDetails3.getArrivalTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 32);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) (short) 0);
        processDetails3.setArrivalTime(0);
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) 'a');
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str15 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        int int18 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
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
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime(32);
        processDetails3.setArrivalTime((int) '#');
        java.lang.String str26 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str29 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setArrivalTime((int) (short) 100);
        int int16 = processDetails3.getArrivalTime();
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) ' ');
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
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
        int int20 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) -1, 0);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 0);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setWaitingTime(97);
        int int15 = processDetails3.getBurstTime();
        java.lang.String str16 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
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
        int int18 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
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
        int int18 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setArrivalTime((int) ' ');
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
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
        int int18 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(1);
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getWaitingTime();
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setArrivalTime((int) '#');
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getBurstTime();
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime(100);
        processDetails3.setTurnAroundTimeTime(0);
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setBurstTime(10);
        int int18 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(100);
        int int15 = processDetails3.getWaitingTime();
        int int16 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setWaitingTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, (int) (byte) 10);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        processDetails3.setProcessId("");
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setWaitingTime((int) (byte) 10);
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) '#', (int) (byte) 0);
        processDetails3.setBurstTime((int) (short) 10);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(0);
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 1, (int) '#');
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass7 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (short) 10);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str7 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        int int7 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        int int15 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) 'a');
        java.lang.String str18 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setBurstTime((int) '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) -1, 0);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
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
        java.lang.String str16 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) 'a');
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) '4');
        processDetails3.setArrivalTime(1);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, (int) ' ');
        processDetails3.setProcessId("");
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', 100);
        processDetails3.setArrivalTime(0);
        int int6 = processDetails3.getWaitingTime();
        java.lang.String str7 = processDetails3.getProcessId();
        int int8 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (byte) 10);
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime(32);
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setBurstTime((int) (short) 10);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setArrivalTime((int) (byte) 1);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(97);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(52);
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (short) -1);
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 0);
        processDetails3.setWaitingTime(32);
        processDetails3.setBurstTime((int) 'a');
        processDetails3.setArrivalTime((-1));
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setWaitingTime(100);
        processDetails3.setTurnAroundTimeTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(52);
        java.lang.String str17 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) '4');
        int int20 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, 100);
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setArrivalTime((-1));
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 100);
        int int12 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass13 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(1);
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, 0);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(35);
        int int7 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
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
        int int21 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        processDetails3.setWaitingTime(0);
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(97);
        int int11 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (byte) 100);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        int int9 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) ' ');
        java.lang.String str17 = processDetails3.getProcessId();
        int int18 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), (int) (short) 100);
        processDetails3.setBurstTime((int) (short) 100);
        int int6 = processDetails3.getBurstTime();
        int int7 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(97);
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getWaitingTime();
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime(35);
        int int17 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (byte) -1);
        processDetails3.setWaitingTime((int) (byte) 1);
        int int6 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (-1));
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (short) 10);
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (short) 10);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(1);
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setBurstTime(52);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getArrivalTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setWaitingTime((int) '#');
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int14 = processDetails3.getArrivalTime();
        int int15 = processDetails3.getWaitingTime();
        java.lang.String str16 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, 0);
        java.lang.Class<?> wildcardClass4 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        int int19 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        java.lang.Class<?> wildcardClass22 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(10);
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getArrivalTime();
        java.lang.String str16 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
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
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 0);
        processDetails3.setArrivalTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        java.lang.Class<?> wildcardClass11 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        int int11 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) -1);
        java.lang.String str4 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 0, (int) '#');
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 0);
        processDetails3.setProcessId("");
        int int18 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
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
        java.lang.String str17 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) 'a');
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
        int int15 = processDetails3.getArrivalTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setArrivalTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("hi!");
        int int14 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime((int) (byte) 10);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setArrivalTime(0);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setBurstTime((int) (byte) 0);
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
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
        processDetails3.setBurstTime(0);
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setBurstTime(32);
        int int25 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(97);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (short) 10);
        processDetails3.setWaitingTime((int) (short) 0);
        int int16 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
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
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        int int24 = processDetails3.getArrivalTime();
        int int25 = processDetails3.getBurstTime();
        int int26 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, (int) (byte) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        int int7 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setWaitingTime(32);
        int int16 = processDetails3.getWaitingTime();
        int int17 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setWaitingTime((int) (byte) 0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        int int9 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) 0);
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) (short) 1);
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) '4');
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setWaitingTime((int) (byte) 10);
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), (int) (byte) -1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 52);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setWaitingTime(0);
        processDetails3.setArrivalTime((int) '4');
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
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
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 0);
        int int21 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        java.lang.String str6 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) ' ');
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) '4');
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((-1));
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) 10);
        processDetails3.setBurstTime((int) '#');
        int int13 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 52);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setWaitingTime((int) (byte) 10);
        processDetails3.setWaitingTime(0);
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setWaitingTime(97);
        java.lang.String str8 = processDetails3.getProcessId();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setArrivalTime(0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setBurstTime(97);
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setWaitingTime(10);
        processDetails3.setArrivalTime(1);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        int int15 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setProcessId("");
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setArrivalTime((int) (byte) 0);
        int int9 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, (int) (byte) 10);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(0);
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) 'a');
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        int int13 = processDetails3.getArrivalTime();
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
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
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(52);
        processDetails3.setWaitingTime((int) (byte) 0);
        int int26 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int29 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (byte) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(52);
        processDetails3.setWaitingTime(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        int int11 = processDetails3.getArrivalTime();
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '#', (int) (byte) 10);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', 10);
        processDetails3.setArrivalTime((-1));
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setProcessId("");
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getArrivalTime();
        int int13 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) (short) 10);
        processDetails3.setProcessId("hi!");
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) 0);
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (short) -1);
        java.lang.String str12 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getArrivalTime();
        int int17 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime((int) 'a');
        processDetails3.setBurstTime(0);
        processDetails3.setTurnAroundTimeTime((int) '#');
        java.lang.String str18 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 100);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setArrivalTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 35, (int) (short) 10);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(52);
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        int int6 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 100);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(0);
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getWaitingTime();
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime(97);
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) 100);
        int int17 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 0, (int) (short) -1);
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (byte) 100);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int7 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setArrivalTime((int) 'a');
        processDetails3.setProcessId("");
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(100);
        processDetails3.setBurstTime(52);
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getTurnAroundTimeTime();
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        processDetails3.setArrivalTime(52);
        int int18 = processDetails3.getWaitingTime();
        int int19 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(35);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setBurstTime(1);
        java.lang.String str12 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 0, (int) (byte) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((-1));
        processDetails3.setWaitingTime((int) (short) -1);
        int int15 = processDetails3.getBurstTime();
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime(100);
        int int19 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
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
        int int20 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (short) 100);
        int int12 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) 'a');
        int int15 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setWaitingTime(52);
        int int20 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        processDetails3.setArrivalTime(1);
        processDetails3.setBurstTime(1);
        int int12 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) 'a');
        int int4 = processDetails3.getBurstTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime(10);
        processDetails3.setBurstTime((int) 'a');
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setWaitingTime(0);
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
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
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 97, 100);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setArrivalTime(35);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, 97);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (byte) 1);
        int int8 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) -1, 52);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) (short) 1);
        java.lang.String str15 = processDetails3.getProcessId();
        java.lang.String str16 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
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
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime(32);
        int int24 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getBurstTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getBurstTime();
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (byte) -1);
        int int12 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
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
        processDetails3.setArrivalTime((int) '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getArrivalTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 10, (int) '4');
        processDetails3.setWaitingTime((int) '4');
        java.lang.Class<?> wildcardClass6 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) (short) 10);
        processDetails3.setWaitingTime((int) 'a');
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setBurstTime(1);
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setArrivalTime(35);
        processDetails3.setWaitingTime((-1));
        int int13 = processDetails3.getBurstTime();
        int int14 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        processDetails3.setWaitingTime(100);
        processDetails3.setWaitingTime((int) (byte) 1);
        int int17 = processDetails3.getTurnAroundTimeTime();
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
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
        int int21 = processDetails3.getArrivalTime();
        int int22 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        processDetails3.setArrivalTime((int) (short) -1);
        processDetails3.setWaitingTime((int) '#');
        processDetails3.setTurnAroundTimeTime((int) 'a');
        processDetails3.setBurstTime(100);
        processDetails3.setArrivalTime((int) '4');
        java.lang.String str23 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(97);
        int int8 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 10, (int) (byte) 0);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("");
        processDetails3.setProcessId("hi!");
        int int10 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
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
        processDetails3.setTurnAroundTimeTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
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
        processDetails3.setWaitingTime((int) (byte) -1);
        int int18 = processDetails3.getBurstTime();
        int int19 = processDetails3.getArrivalTime();
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, (int) (short) 10);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        processDetails3.setTurnAroundTimeTime((int) '4');
        processDetails3.setBurstTime((int) ' ');
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(10);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(100);
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime(1);
        int int9 = processDetails3.getArrivalTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getBurstTime();
        processDetails3.setBurstTime(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setWaitingTime(10);
        processDetails3.setArrivalTime(52);
        int int8 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        processDetails3.setArrivalTime((int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
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
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime(0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setProcessId("");
        int int16 = processDetails3.getTurnAroundTimeTime();
        int int17 = processDetails3.getTurnAroundTimeTime();
        int int18 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 1, (int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setTurnAroundTimeTime((int) (short) 0);
        processDetails3.setArrivalTime((int) (short) 0);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) 'a');
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) -1);
        int int7 = processDetails3.getArrivalTime();
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime(10);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(100);
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getArrivalTime();
        java.lang.String str6 = processDetails3.getProcessId();
        int int7 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setBurstTime((int) 'a');
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 97, 97);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getArrivalTime();
        int int6 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, (int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(0);
        processDetails3.setProcessId("");
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
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
        processDetails3.setArrivalTime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        int int10 = processDetails3.getArrivalTime();
        int int11 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, 0);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) ' ', 0);
        processDetails3.setWaitingTime(0);
        int int6 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) 'a');
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime(52);
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime((int) (byte) 1);
        processDetails3.setBurstTime((int) (byte) 10);
        processDetails3.setProcessId("hi!");
        int int15 = processDetails3.getArrivalTime();
        java.lang.String str16 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setProcessId("hi!");
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) (byte) 100);
        processDetails3.setArrivalTime(1);
        processDetails3.setTurnAroundTimeTime(35);
        processDetails3.setArrivalTime((int) (short) 10);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 100, 10);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime(1);
        processDetails3.setWaitingTime((int) (short) 100);
        java.lang.String str11 = processDetails3.getProcessId();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(1);
        processDetails3.setTurnAroundTimeTime(32);
        processDetails3.setTurnAroundTimeTime((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        processDetails3.setWaitingTime(1);
        processDetails3.setProcessId("");
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        java.lang.String str21 = processDetails3.getProcessId();
        int int22 = processDetails3.getArrivalTime();
        int int23 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime(10);
        int int15 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(97);
        processDetails3.setWaitingTime((int) (byte) 100);
        int int20 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        int int9 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, 0);
        processDetails3.setProcessId("hi!");
        processDetails3.setProcessId("hi!");
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 0, (int) (short) 0);
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setProcessId("");
        java.lang.String str8 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        int int11 = processDetails3.getArrivalTime();
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime((int) '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        int int12 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((-1));
        processDetails3.setArrivalTime((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
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
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
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
        int int18 = processDetails3.getArrivalTime();
        processDetails3.setTurnAroundTimeTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 52, (int) (short) 100);
        processDetails3.setBurstTime(1);
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) -1);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 100, (int) (byte) 1);
        java.lang.String str4 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (short) -1);
        int int7 = processDetails3.getWaitingTime();
        int int8 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((-1));
        int int11 = processDetails3.getBurstTime();
        java.lang.Class<?> wildcardClass12 = processDetails3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) (byte) 1);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        java.lang.String str19 = processDetails3.getProcessId();
        processDetails3.setWaitingTime(10);
        processDetails3.setWaitingTime(1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        int int11 = processDetails3.getTurnAroundTimeTime();
        int int12 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) ' ', (int) (byte) 0);
        int int4 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setProcessId("hi!");
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        int int16 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (int) (byte) 10);
        processDetails3.setBurstTime(0);
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime(100);
        int int10 = processDetails3.getBurstTime();
        int int11 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setTurnAroundTimeTime(52);
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("hi!");
        int int12 = processDetails3.getWaitingTime();
        int int13 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (byte) 1, (int) ' ');
        processDetails3.setTurnAroundTimeTime((int) '#');
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setTurnAroundTimeTime((int) (byte) 0);
        processDetails3.setBurstTime(0);
        int int12 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
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
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime(10);
        int int15 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(0);
        int int18 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        int int9 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) ' ');
        processDetails3.setTurnAroundTimeTime(0);
        processDetails3.setArrivalTime((int) '4');
        int int16 = processDetails3.getBurstTime();
        java.lang.String str17 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (byte) 10);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setBurstTime(97);
        int int10 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) '4');
        int int13 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (-1), 0);
        processDetails3.setWaitingTime(35);
        int int6 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) '4');
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (byte) 0);
        processDetails3.setWaitingTime(32);
        int int14 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime(10);
        java.lang.String str14 = processDetails3.getProcessId();
        int int15 = processDetails3.getArrivalTime();
        java.lang.String str16 = processDetails3.getProcessId();
        int int17 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
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
        processDetails3.setBurstTime((-1));
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime(0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(52);
        processDetails3.setArrivalTime(32);
        int int17 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setArrivalTime(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime((int) (short) 1);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (short) 0);
        processDetails3.setTurnAroundTimeTime(97);
        processDetails3.setArrivalTime((int) '4');
        processDetails3.setTurnAroundTimeTime((int) ' ');
        int int16 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setBurstTime(0);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(52);
        processDetails3.setArrivalTime((int) (short) 1);
        java.lang.String str17 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
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
        java.lang.String str16 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 10, (int) (short) 10);
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (byte) 1);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        int int7 = processDetails3.getArrivalTime();
        int int8 = processDetails3.getArrivalTime();
        java.lang.String str9 = processDetails3.getProcessId();
        java.lang.Class<?> wildcardClass10 = processDetails3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getBurstTime();
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) -1);
        java.lang.String str16 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, 0);
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        processDetails3.setTurnAroundTimeTime((-1));
        java.lang.String str8 = processDetails3.getProcessId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
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
        processDetails3.setWaitingTime(0);
        processDetails3.setWaitingTime((int) (short) -1);
        int int24 = processDetails3.getBurstTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        processDetails3.setProcessId("");
        int int6 = processDetails3.getTurnAroundTimeTime();
        int int7 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 100);
        processDetails3.setWaitingTime(10);
        int int12 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(100);
        int int15 = processDetails3.getTurnAroundTimeTime();
        int int16 = processDetails3.getWaitingTime();
        int int17 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 32, (int) (byte) 1);
        processDetails3.setTurnAroundTimeTime((int) (short) 100);
        processDetails3.setArrivalTime((int) (short) 0);
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (short) 0);
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime(10);
        processDetails3.setBurstTime((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '4');
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(97);
        int int13 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setTurnAroundTimeTime((int) (short) 10);
        processDetails3.setWaitingTime(10);
        processDetails3.setBurstTime((int) '4');
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getBurstTime();
        java.lang.String str5 = processDetails3.getProcessId();
        int int6 = processDetails3.getWaitingTime();
        int int7 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setWaitingTime(32);
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        int int14 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", 0, (int) '4');
        processDetails3.setTurnAroundTimeTime((int) (byte) 1);
        processDetails3.setProcessId("");
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (int) (short) 0, 97);
        processDetails3.setTurnAroundTimeTime((int) (byte) 10);
        processDetails3.setWaitingTime((int) ' ');
        int int8 = processDetails3.getBurstTime();
        java.lang.String str9 = processDetails3.getProcessId();
        int int10 = processDetails3.getBurstTime();
        processDetails3.setBurstTime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setArrivalTime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (short) 100);
        int int7 = processDetails3.getTurnAroundTimeTime();
        int int8 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setArrivalTime((int) '4');
        processDetails3.setWaitingTime(1);
        processDetails3.setProcessId("");
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setArrivalTime((int) (byte) 0);
        processDetails3.setArrivalTime((int) (short) 100);
        int int21 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        processDetails3.setBurstTime((int) (byte) 100);
        int int6 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime((int) (short) -1);
        processDetails3.setWaitingTime((int) (short) 10);
        int int11 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime(1);
        int int14 = processDetails3.getTurnAroundTimeTime();
        java.lang.String str15 = processDetails3.getProcessId();
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 100, (-1));
        processDetails3.setWaitingTime(100);
        processDetails3.setProcessId("");
        processDetails3.setArrivalTime((int) (short) 10);
        int int10 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setTurnAroundTimeTime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("hi!", (-1), 32);
        processDetails3.setWaitingTime(0);
        int int6 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
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
        java.lang.String str16 = processDetails3.getProcessId();
        processDetails3.setArrivalTime((int) (byte) 10);
        processDetails3.setBurstTime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setArrivalTime(0);
        java.lang.String str12 = processDetails3.getProcessId();
        java.lang.String str13 = processDetails3.getProcessId();
        processDetails3.setTurnAroundTimeTime(10);
        int int16 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 10, 97);
        processDetails3.setWaitingTime(0);
        processDetails3.setProcessId("");
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
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
        processDetails3.setBurstTime((-1));
        processDetails3.setWaitingTime(32);
        processDetails3.setArrivalTime((int) '#');
        processDetails3.setProcessId("");
        int int28 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getBurstTime();
        processDetails3.setTurnAroundTimeTime(100);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getArrivalTime();
        int int14 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setProcessId("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        int int7 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(35);
        processDetails3.setBurstTime((int) (byte) 1);
        int int12 = processDetails3.getTurnAroundTimeTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 0, (int) (short) -1);
        int int4 = processDetails3.getArrivalTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        int int6 = processDetails3.getWaitingTime();
        processDetails3.setTurnAroundTimeTime(35);
        java.lang.String str9 = processDetails3.getProcessId();
        java.lang.String str10 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        java.lang.String str5 = processDetails3.getProcessId();
        processDetails3.setBurstTime(0);
        int int8 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(52);
        processDetails3.setProcessId("hi!");
        processDetails3.setWaitingTime(52);
        int int15 = processDetails3.getBurstTime();
        processDetails3.setWaitingTime(0);
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        int int8 = processDetails3.getWaitingTime();
        int int9 = processDetails3.getBurstTime();
        int int10 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime(1);
        processDetails3.setProcessId("hi!");
        java.lang.String str15 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        int int18 = processDetails3.getBurstTime();
        int int19 = processDetails3.getWaitingTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setBurstTime((int) (short) 1);
        processDetails3.setWaitingTime((int) (byte) -1);
        processDetails3.setTurnAroundTimeTime(10);
        processDetails3.setTurnAroundTimeTime(10);
        java.lang.String str15 = processDetails3.getProcessId();
        int int16 = processDetails3.getArrivalTime();
        processDetails3.setWaitingTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getWaitingTime();
        processDetails3.setBurstTime((int) '#');
        processDetails3.setArrivalTime((int) (short) 100);
        processDetails3.setWaitingTime((int) (byte) 10);
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getBurstTime();
        java.lang.String str14 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) '4', (int) (short) 100);
        processDetails3.setProcessId("hi!");
        processDetails3.setBurstTime(97);
        int int8 = processDetails3.getArrivalTime();
        int int9 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setBurstTime((-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 100, (int) (byte) 1);
        int int4 = processDetails3.getBurstTime();
        processDetails3.setArrivalTime(10);
        java.lang.String str7 = processDetails3.getProcessId();
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setWaitingTime((int) '4');
        processDetails3.setTurnAroundTimeTime((int) (short) 1);
        java.lang.String str9 = processDetails3.getProcessId();
        processDetails3.setBurstTime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setProcessId("");
        processDetails3.setWaitingTime(0);
        int int9 = processDetails3.getBurstTime();
        java.lang.String str10 = processDetails3.getProcessId();
        int int11 = processDetails3.getBurstTime();
        int int12 = processDetails3.getBurstTime();
        java.lang.String str13 = processDetails3.getProcessId();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", 10, (int) (short) 1);
        int int4 = processDetails3.getTurnAroundTimeTime();
        int int5 = processDetails3.getTurnAroundTimeTime();
        processDetails3.setArrivalTime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (byte) 1, 1);
        processDetails3.setArrivalTime((int) (byte) -1);
        processDetails3.setProcessId("hi!");
        java.lang.Class<?> wildcardClass8 = processDetails3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) 'a', (int) (short) 1);
        int int4 = processDetails3.getWaitingTime();
        processDetails3.setWaitingTime((int) (short) 1);
        processDetails3.setProcessId("");
        int int9 = processDetails3.getWaitingTime();
        int int10 = processDetails3.getTurnAroundTimeTime();
        int int11 = processDetails3.getArrivalTime();
        java.lang.String str12 = processDetails3.getProcessId();
        int int13 = processDetails3.getArrivalTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        com.thealgorithms.devutils.entities.ProcessDetails processDetails3 = new com.thealgorithms.devutils.entities.ProcessDetails("", (int) (short) 1, (int) (byte) 0);
        processDetails3.setTurnAroundTimeTime((int) ' ');
        processDetails3.setBurstTime((int) '4');
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
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
        processDetails3.setProcessId("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }
}

