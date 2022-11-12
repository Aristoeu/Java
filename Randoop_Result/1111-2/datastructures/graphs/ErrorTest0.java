package datastructures.graphs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.thealgorithms.datastructures.graphs.HamiltonianCycle hamiltonianCycle0 = new com.thealgorithms.datastructures.graphs.HamiltonianCycle();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = hamiltonianCycle0.isPathFound((int) (byte) 1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.thealgorithms.datastructures.graphs.HamiltonianCycle hamiltonianCycle0 = new com.thealgorithms.datastructures.graphs.HamiltonianCycle();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = hamiltonianCycle0.isPathFound(10);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.thealgorithms.datastructures.graphs.HamiltonianCycle hamiltonianCycle0 = new com.thealgorithms.datastructures.graphs.HamiltonianCycle();
        boolean boolean2 = hamiltonianCycle0.isPresent((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = hamiltonianCycle0.isPathFound(0);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.thealgorithms.datastructures.graphs.HamiltonianCycle hamiltonianCycle0 = new com.thealgorithms.datastructures.graphs.HamiltonianCycle();
        boolean boolean2 = hamiltonianCycle0.isPresent((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = hamiltonianCycle0.isPathFound((int) (short) 1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.thealgorithms.datastructures.graphs.HamiltonianCycle hamiltonianCycle0 = new com.thealgorithms.datastructures.graphs.HamiltonianCycle();
        boolean boolean2 = hamiltonianCycle0.isPresent((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = hamiltonianCycle0.isPathFound((int) (short) 10);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.thealgorithms.datastructures.graphs.HamiltonianCycle hamiltonianCycle0 = new com.thealgorithms.datastructures.graphs.HamiltonianCycle();
        boolean boolean2 = hamiltonianCycle0.isPresent((int) (short) -1);
        boolean boolean4 = hamiltonianCycle0.isPresent((int) (short) 0);
        boolean boolean6 = hamiltonianCycle0.isPresent((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = hamiltonianCycle0.isPathFound((int) (byte) 0);
    }
}

