package others.SkylineProblem;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem skylineProblem9 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building13 = skylineProblem9.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray14 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList15 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList15, skylineArray14);
        skylineProblem9.print(skylineList15);
        com.thealgorithms.others.SkylineProblem skylineProblem18 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building22 = skylineProblem18.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building26 = skylineProblem18.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline29 = skylineProblem18.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem30 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building34 = skylineProblem30.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray35 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList36 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList36, skylineArray35);
        skylineProblem30.print(skylineList36);
        com.thealgorithms.others.SkylineProblem skylineProblem39 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem39.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem39.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline50 = skylineProblem39.new Skyline((int) '4', (int) (byte) 0);
        skyline50.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem53 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building57 = skylineProblem53.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building61 = skylineProblem53.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline64 = skylineProblem53.new Skyline((int) '4', (int) (byte) 0);
        skyline64.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray67 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline50, skyline64 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList68 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList68, skylineArray67);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList70 = skylineProblem18.mergeSkyline(skylineList36, skylineList68);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList71 = skylineProblem0.mergeSkyline(skylineList15, skylineList36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        skylineProblem0.add((int) 'a', (int) (short) 1, 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem12 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building16 = skylineProblem12.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray17 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList18 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList18, skylineArray17);
        skylineProblem12.print(skylineList18);
        com.thealgorithms.others.SkylineProblem skylineProblem21 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building25 = skylineProblem21.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building29 = skylineProblem21.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline32 = skylineProblem21.new Skyline((int) '4', (int) (byte) 0);
        skyline32.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem35 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building39 = skylineProblem35.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem35.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline46 = skylineProblem35.new Skyline((int) '4', (int) (byte) 0);
        skyline46.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray49 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline32, skyline46 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList50 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList50, skylineArray49);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList52 = skylineProblem0.mergeSkyline(skylineList18, skylineList50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        skylineProblem0.add(52, 0, (int) (byte) -1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) (short) 10, 35, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList7 = skylineProblem0.findSkyline(0, 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '4', (int) ' ', 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList7 = skylineProblem0.findSkyline((int) (byte) 10, (int) 'a');
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem skylineProblem9 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building13 = skylineProblem9.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray14 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList15 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList15, skylineArray14);
        skylineProblem9.print(skylineList15);
        com.thealgorithms.others.SkylineProblem skylineProblem18 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building22 = skylineProblem18.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building26 = skylineProblem18.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline29 = skylineProblem18.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem30 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building34 = skylineProblem30.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray35 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList36 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList36, skylineArray35);
        skylineProblem30.print(skylineList36);
        com.thealgorithms.others.SkylineProblem skylineProblem39 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building43 = skylineProblem39.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem39.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline50 = skylineProblem39.new Skyline((int) '4', (int) (byte) 0);
        skyline50.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem53 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building57 = skylineProblem53.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building61 = skylineProblem53.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline64 = skylineProblem53.new Skyline((int) '4', (int) (byte) 0);
        skyline64.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray67 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline50, skyline64 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList68 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList68, skylineArray67);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList70 = skylineProblem18.mergeSkyline(skylineList36, skylineList68);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList71 = skylineProblem0.mergeSkyline(skylineList15, skylineList36);
        com.thealgorithms.others.SkylineProblem.Building building75 = skylineProblem0.new Building(100, (int) (short) 1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        skylineProblem0.add(52, 100, (-1));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) (short) 1, (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        skylineProblem0.add((int) ' ', 97, 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        skylineProblem0.add(0, (-1), (int) (byte) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) '#', (int) (byte) -1);
        com.thealgorithms.others.SkylineProblem.Building building18 = skylineProblem0.new Building((int) (short) 10, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.others.SkylineProblem.Skyline skyline21 = skylineProblem0.new Skyline((int) (byte) 1, (int) (short) 1);
        com.thealgorithms.others.SkylineProblem.Building building25 = skylineProblem0.new Building((int) (byte) 1, (int) (short) 1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        skylineProblem0.add((int) (byte) 100, (int) (byte) 0, 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building8 = skylineProblem0.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline11 = skylineProblem0.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline14 = skylineProblem0.new Skyline((int) (short) 100, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        skylineProblem0.add((int) (short) 100, 52, (int) '4');
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList7 = skylineProblem0.findSkyline((int) ' ', (int) ' ');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '4', (int) ' ', 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        skylineProblem0.add(1, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray5 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList6 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList6, skylineArray5);
        skylineProblem0.print(skylineList6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        skylineProblem0.add((int) (short) 100, 97, (int) (short) 10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.thealgorithms.others.SkylineProblem skylineProblem0 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building4 = skylineProblem0.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline7 = skylineProblem0.new Skyline(10, (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem8 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building12 = skylineProblem8.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building16 = skylineProblem8.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline19 = skylineProblem8.new Skyline((int) '4', (int) (byte) 0);
        com.thealgorithms.others.SkylineProblem skylineProblem20 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building24 = skylineProblem20.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray25 = new com.thealgorithms.others.SkylineProblem.Skyline[] {};
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList26 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList26, skylineArray25);
        skylineProblem20.print(skylineList26);
        com.thealgorithms.others.SkylineProblem skylineProblem29 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building33 = skylineProblem29.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building37 = skylineProblem29.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline40 = skylineProblem29.new Skyline((int) '4', (int) (byte) 0);
        skyline40.height = (short) 10;
        com.thealgorithms.others.SkylineProblem skylineProblem43 = new com.thealgorithms.others.SkylineProblem();
        com.thealgorithms.others.SkylineProblem.Building building47 = skylineProblem43.new Building((int) '#', 100, 0);
        com.thealgorithms.others.SkylineProblem.Building building51 = skylineProblem43.new Building((int) (short) 10, 10, 0);
        com.thealgorithms.others.SkylineProblem.Skyline skyline54 = skylineProblem43.new Skyline((int) '4', (int) (byte) 0);
        skyline54.height = (short) 10;
        com.thealgorithms.others.SkylineProblem.Skyline[] skylineArray57 = new com.thealgorithms.others.SkylineProblem.Skyline[] { skyline40, skyline54 };
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList58 = new java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.thealgorithms.others.SkylineProblem.Skyline>) skylineList58, skylineArray57);
        java.util.ArrayList<com.thealgorithms.others.SkylineProblem.Skyline> skylineList60 = skylineProblem8.mergeSkyline(skylineList26, skylineList58);
        skylineProblem0.print(skylineList60);
        com.thealgorithms.others.SkylineProblem.Skyline skyline64 = skylineProblem0.new Skyline((int) 'a', 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        skylineProblem0.add((int) ' ', (int) (byte) 10, (int) 'a');
    }
}

