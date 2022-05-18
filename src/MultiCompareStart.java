/******************************************************************************
 *      Student: Sean Harrington
 *         Date: 16 JUN 2020
 *       Course: IT-516 Data Structures & Algorithms
 *   Assignment: HW03
 *
 *  Merges together the sorted input stream given as command-line arguments
 *  into a single sorted output stream on standard output.
 *
 *  Compile...
 *  javac-algs4 MultiCompareStart.java
 *
 *  Use...
 *  java-algs4 MultiCompareStart 1000 100
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdOut;

public class MultiCompareStart {
    public static void main(String[] args) {
        // Let's handle the command line parameters: if the user forgets them, give defaults.
        // Otherwise parse them into int values.
        int n;
        int trials;
        if (args[0] == null) {
            n = 1000;
        } else {
            n = Integer.parseInt(args[0]);
        }
        if (args[1] == null) {
            trials = 100;
        } else {
            trials = Integer.parseInt(args[1]);
        }

        int arraySize = 3;   // **** This should be expanded to reflect the size of your list of sorts
        String[] sortTypes = new String[arraySize];
        sortTypes[0] = "Insertion";
        sortTypes[1] = "Selection";
        sortTypes[2] = "Shell";
        // **** You'll want to add additional sort calls here...
        Double[] sortTimes = new Double[arraySize];   // This holds your timing results

        StdOut.println();
        StdOut.println("Running " + trials + " trials of " + n + " random numbers each...");
        StdOut.println("---------------------------------------------------");

        for (int i = 0; i <= sortTypes.length - 1; i++) {
            // **** You will need to change the line below to work with YOUR "SortCompare", not the ...Start one.
            sortTimes[i] = SortCompareStart.timeRandomInput(sortTypes[i], n, trials);
        }

        // **** You don't need to edit anything below this line.

        // Sort the sortTimes (and the corresponding sortTypes) below.
        // I use Insertion sort for simplicity...
        for (int i = 1; i < sortTimes.length; i++) {
            for (int j = i; j > 0 && (sortTimes[j] < sortTimes[j - 1]); j--) {
                double tempTime = sortTimes[j];
                String tempType = sortTypes[j];
                sortTimes[j] = sortTimes[j - 1];
                sortTypes[j] = sortTypes[j - 1];
                sortTimes[j - 1] = tempTime;
                sortTypes[j - 1] = tempType;
            }
        }

        for (int i = 0; i <= sortTypes.length - 1; i++) {
            String pad = new String();
            for (int c = 12 - sortTypes[i].length(); c > 0; c--) {
                pad += " ";
            }
            StdOut.print(pad + sortTypes[i]);
            if (sortTimes[i] < 0.1) {
                StdOut.println(" < 1/10 second (avg)");
            } else if (sortTimes[i] < 10) {
                StdOut.printf(" =  %.3f seconds (avg)\n", sortTimes[i]);
            } else {
                StdOut.printf(" = %.3f seconds (avg)\n", sortTimes[i]);
            }
        }
    }
}
