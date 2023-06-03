import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdOut;

public class BagTester {
    public static void main(String[] args) {
        Bag<String> things = new Bag<String>();                             // Make a new empty Bag called "things"
        StdOut.println("Is this new Bag empty? " + things.isEmpty());       // Use the isEmpty() function
        things.add("rock");                                                 // Use the add() function
        StdOut.println("rock");                                             // Print the last thing added
        things.add("paper");                                                // Use the add() function
        StdOut.println("paper");                                            // Print the last thing added
        things.add("scissors");                                             // Use the add() function
        StdOut.println("scissors");                                         // Print the last thing added
        things.add("lizard");                                               // Use the add() function
        StdOut.println("lizard");                                           // Print the last thing added
        things.add("Spock");                                                // Use the add() function
        StdOut.println("Spock");                                            // Print the last thing added
        StdOut.println("Bag now has " + things.size() + " items in it.");   // Use the size() function

        StdOut.println("Iterating through Bag items...");
        String allItems = "";                                               // Create a new String to hold the output
        for (String thisItem : things)                                      // Use the Iterator parent class to print each item
            StdOut.println(thisItem);
        StdOut.println(allItems);                                           // Print out the allItems String
        StdOut.println();                                                   // Blank line

        StdOut.println("Bag still has " + things.size() + " items in it."); // Show that Bag still has all items in it
    }
}
