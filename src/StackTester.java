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
 *  javac-algs4 xxxxx.java
 *
 *  Use...
 *  java-algs4 xxxxx
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class StackTester {
    public static void main(String[] args) {
        Stack<String> things = new Stack<String>();                        // Make a new empty Stack called "things"
        StdOut.println("Is this new Stack empty? " + things.isEmpty());    // Use the isEmpty() function

        StdOut.println("Push items...");
        things.push("rock");                                               // Use the push() function
        StdOut.print(things.peek() + " ");                                 // Print the last thing we added
        things.push("paper");                                              // Use the push() function
        StdOut.print(things.peek() + " ");                                 // Print the last thing we added
        things.push("scissors");                                           // Use the push() function
        StdOut.print(things.peek() + " ");                                 // Print the last thing we added
        things.push("lizard");                                             // Use the push() function
        StdOut.print(things.peek() + " ");                                 // Print the last thing we added
        things.push("Spock");                                              // Use the push() function
        StdOut.print(things.peek() + " ");                                 // Print the last thing we added
        StdOut.println();
        StdOut.println("Stack now has " + things.size() + " items in it."); // Use the size() function

        StdOut.println("Iterating through Stack items...");
        String allItems = "";                                               // Create a new String to hold the output
        for (String thisItem : things)                                      // Use the Iterator parent class to go through each item
            allItems += (thisItem + " ");                                   // Concatenate each item to the allItems String
        StdOut.println(allItems);                                           // Print out the allItems String

        StdOut.println("Stack still has " + things.size() + " items in it."); // We iterated, not popped!

        StdOut.println("Pop items...");
        while (!things.isEmpty()) {                                         // Use while loop until Stack isEmpty() is true
            StdOut.print(things.pop() + " ");                               // Pop each item to the output
        }
        StdOut.println();                                                   // Blank line
        StdOut.println("Stack now has " + things.size() + " items in it."); // Show that Stack has zero items in it now
    }
}
