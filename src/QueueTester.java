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
 *  javac-algs4 QueueTester.java
 *
 *  Use...
 *  java-algs4 QueueTester
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class QueueTester {
    public static void main(String[] args) {
        Queue<String> people = new Queue<String>();                        // Make a new empty Queue called "people"
        StdOut.println("Is this new Queue empty? " + people.isEmpty());    // Use the isEmpty() function

        StdOut.println("Enqueue people...");
        people.enqueue("Dani Chong");                                      // Use the enqueue() function
        StdOut.println("  Dani Chong");                                    // Print the last person we added
        people.enqueue("Barbara Perez");                                   // Use the enqueue() function
        StdOut.println("  Barbara Perez");                                 // Print the last person we added
        people.enqueue("Ritesh Solanki");                                  // Use the enqueue() function
        StdOut.println("  Ritesh Solanki");                                // Print the last person we added
        people.enqueue("Matthew Gold");                                    // Use the enqueue() function
        StdOut.println("  Matthew Gold");                                  // Print the last person we added
        people.enqueue("Alam Simari");                                     // Use the enqueue() function
        StdOut.println("  Alam Simari");                                   // Print the last person we added
        StdOut.println("Queue now has " + people.size() + " people in it."); // Use the size() function
        StdOut.println();

        StdOut.println("Iterating through Queue people...");
        for (String thisPerson : people)                                    // Use the Iterator parent class to print each person
            StdOut.println("  " + thisPerson);
        StdOut.println("Queue still has " + people.size() + " people in it."); // We iterated, not dequeued!
        StdOut.println();

        StdOut.println("Dequeue people...");
        while (!people.isEmpty()) {                                         // Use while loop until Queue isEmpty() is true
            StdOut.println("  " + people.dequeue());                        // Dequeue each person to the output
        }
        StdOut.println();                                                   // Blank line
        StdOut.println("Queue now has " + people.size() + " people in it."); // Show that Queue has zero people in it now
    }
}
