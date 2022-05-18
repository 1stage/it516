/* *****************************************************************************
 *      Student: Sean Harrington
 *         Date: DD MON YYYY
 *       Course: IT-516 Data Structures & Algorithms
 *   Assignment: HW06
 *
 *  Test out the StdRandom library
 *
 *  Compile...
 *  javac-algs4 randomClient.java
 *
 *  Use...
 *  java-algs4 RandomClient
 *
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomClientStart { // Change this name and the filename to RandomClient for the final submission
    public static void main(String[] args) {

        int myTrials = 0;

        try { // This TRY command safely checks the args[0] value, if there is one
            myTrials = Integer.parseInt(args[0]);  // If there is an int command-line argument, change it to that
        } catch (Exception e) {
            myTrials = 1;  // otherwise, just use 1
        }

        if (myTrials > 10) {  // Anything more than 10 trials is too much
            StdOut.println();
            StdOut.println("Too many trials. Reduced to 10.");
            myTrials = 10;
        }

        // Standard variables for random function inputs
        // Change these for your own purposes.
        // Add more as necessary (it will be)
        // Look at page 235 (Unit testing) for some ideas on possible values...

        int myIntMax = 100; // This is used to test StdRandom.uniform() for ints
        // Need two doubles here to test StdRandom.uniform() for doubles lo and hi
        // Need double for StdRandom.bernoulli()
        // Need two doubles for StdRandom.gaussian()
        // Need an array of doubles to test StdRandom.discrete()
        // Need an array of ints to test StdRandom.shuffle()


        for (int i = 0; i < myTrials; i++) { // Perform this for the number of myTrials
            StdOut.println();
            StdOut.println("StdRandom Test Client");
            StdOut.println("--------------------------------");
            StdOut.println("Testing uniform(" + myIntMax + ") = " + StdRandom.uniform(myIntMax));
            StdOut.println("Testing uniform() = "); // Add your variables from above, and use this ^ line as an example
            StdOut.println("Testing bernoulli() = ");
            StdOut.println("Testing gaussian() = ");
            StdOut.println("Testing discrete() = ");
            // Use this to print out an array -> StdOut.println(Arrays.toString(myIntArray));
            // to show the array BEFORE you shuffle it
            StdOut.print("Testing shuffle() = ");
            // Then use this again to show the new sorted array -> StdOut.println(Arrays.toString(myIntArray));
            StdOut.println();
        }
    }
}
