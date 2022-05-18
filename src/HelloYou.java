/******************************************************************************
 *      Student: Sean Harrington
 *         Date: DD MON YYYY
 *       Course: IT-516 Data Structures & Algorithms
 *   Assignment: HWxx
 *
 *  Merges together the sorted input stream given as command-line arguments
 *  into a single sorted output stream on standard output.
 *
 *  Compile...
 *  javac-algs4 HelloYou.java
 *
 *  Use...
 *  java-algs4 HelloYou Moo Harrington
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdOut;

public class HelloYou {
    public static void main(String[] args) {
        String yourName = args[0];
        String myName = args[1];
        StdOut.println("Hello " + yourName + "!");
        StdOut.println("Sincerely, " + myName);
    }
}
