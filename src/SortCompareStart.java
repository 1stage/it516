/******************************************************************************
 *      Student: Sean Harrington
 *         Date: 16 JUN 2020
 *       Course: IT-516 Data Structures & Algorithms
 *   Assignment: HW03
 *
 *  Performs sorts on given sizes of trials and returns the Stopwatch()
 *  value for those results
 *
 *  Compile...
 *  javac-algs4 SortCompareStart.java
 *
 *  Use...
 *  java-algs4 SortCompareStart
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.*;

public class SortCompareStart {
    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) Insertion.sort(a);
        if (alg.equals("Selection")) Selection.sort(a);
        if (alg.equals("Shell")) Shell.sort(a);
        // **** Add additional sort types below...
        // **** Make sure their String is listed in MultiCompare
        // **** Review algs4.jar for the specific names of the
        // **** sort types mentioned in the book

        return timer.elapsedTime();
    }

    // **** You don't need to edit anything below this line.

    // This is the method you'll be calling...
    public static double timeRandomInput(String alg, int n, int trials) {
        double total = 0.0;
        Double[] a = new Double[n];
        for (int t = 0; t < trials; t++) {
            for (int i = 0; i < n; i++)
                a[i] = StdRandom.uniform(0.0, 1.0);
            total += time(alg, a);
        }
        return total;
    }

    // You will NOT be calling the main() method from your program...
    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int n = Integer.parseInt(args[2]);
        int trials = Integer.parseInt(args[3]);
        double time1 = timeRandomInput(alg1, n, trials);
        double time2 = timeRandomInput(alg2, n, trials);
        double ratio = time2 / time1;
        StdOut.printf("For %d random Doubles\n    %s is", n, alg1);
        StdOut.printf(" %.1f times faster than %s\n", ratio, alg2);
    }
}
