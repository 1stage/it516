import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdOut;

public class BagTester {
    public static void main(String[] args) {
        Bag<String> things = new Bag<String>();                             // Make a new empty Bag called "things"
        StdOut.println("Is this new Bag empty? " + things.isEmpty());       // Use the isEmpty() function
        things.add("rock");                                                 // Use the add() function
        things.add("paper");                                                // Use the add() function
        things.add("scissors");                                             // Use the add() function
        things.add("lizard");                                               // Use the add() function
        things.add("Spock");                                                // Use the add() function
        StdOut.println("Bag now has " + things.size() + " items in it.");   // Use the size() function

        StdOut.println("Iterating through Bag items...");
        String allItems = "";                                               // Create a new String to hold the output
        for (String thisItem : things)                                      // Use the Iterator parent class to go through each item
            allItems += (thisItem + " ");                                   // Concatenate each item to the allItems String
        StdOut.println(allItems);                                           // Print out the allItems String
        StdOut.println();                                                   // Blank line

        StdOut.println("Bag still has " + things.size() + " items in it."); // Show that Bag still has all items in it
    }
}
