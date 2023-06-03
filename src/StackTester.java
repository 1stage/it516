/******************************************************************************
 *      Student: Sean Harrington
 *         Date: DD MON YYYY
 *       Course: IT-516 Data Structures & Algorithms
 *   Assignment: HW02
 *
 *  Merges together the sorted input stream given as command-line arguments
 *  into a single sorted output stream on standard output.
 *
 *  Compile...
 *  javac-algs4 StackTester.java
 *
 *  Use...
 *  java-algs4 StackTester
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class StackTester {
    public static void main(String[] args) {
        Stack<String> cards = new Stack<String>();                         // Make a new empty Stack called "cards"
        StdOut.println("Is this new Stack empty? " + cards.isEmpty());     // Use the isEmpty() function

        StdOut.println("Push cards...");
        cards.push("2 of Hearts");                                         // Use the push() function
        StdOut.println(cards.peek() + " ");                                // Print the last card we added
        cards.push("Ace of Spades");                                       // Use the push() function
        StdOut.println(cards.peek() + " ");                                // Print the last card we added
        cards.push("9 of Diamonds");                                       // Use the push() function
        StdOut.println(cards.peek() + " ");                                // Print the last card we added
        cards.push("Queen of Clubs");                                      // Use the push() function
        StdOut.println(cards.peek() + " ");                                // Print the last card we added
        cards.push("7 of Spades");                                         // Use the push() function
        StdOut.println(cards.peek() + " ");                                // Print the last card we added
        StdOut.println();
        StdOut.println("Stack now has " + cards.size() + " cards in it."); // Use the size() function

        StdOut.println("Iterating through Stack cards...");
        for (String thisCard : cards)                                      // Use the Iterator parent class to print each card
            StdOut.println(thisCard);
        StdOut.println("Stack still has " + cards.size() + " cards in it."); // We iterated, not popped!

        StdOut.println("Pop cards...");
        while (!cards.isEmpty()) {                                         // Use while loop until Stack isEmpty() is true
            StdOut.println(cards.pop() + " ");                             // Pop each card to the output
        }
        StdOut.println();                                                  // Blank line
        StdOut.println("Stack now has " + cards.size() + " cards in it."); // Show that Stack has zero cards in it now
    }
}
