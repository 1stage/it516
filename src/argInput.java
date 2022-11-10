/******************************************************************************
 *      Student: Firstname Lastname
 *         Date: DD MON YYYY
 *       Course: IT-516 Data Structures & Algorithms
 *   Assignment: HW00
 *
 *  Takes two strings as command line arguments and prints them out.
 *  Errors given for more than or less than two arguments.
 *
 *  Compile...
 *  javac-algs4 argInput.java
 *
 *  Use...
 *  java-algs4 argInput FirstWord SecondWord
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdOut;

public class argInput {
    public static void main(String[] args) {
        // This section checks for too many arguments
        if (args.length > 2) {
            StdOut.println("Too many arguments! Try again with only two.");
        }
        // This section checks for too few arguments
        if (args.length < 2) {
            StdOut.println("Too few arguments! Try again with exactly two.");
        }
        // This section works if there are EXACTLY two arguments
        // Remember that arrays are ZERO indexed, so args[0] is the FIRST item.
        // Also, "==" is the check for IS EQUAL TO. Using "=" ASSIGNS a value, which is wrong.
        if (args.length == 2) {
            StdOut.println("Hello, " + args[0] + " " + args[1] + "!");
        }
    }
}
