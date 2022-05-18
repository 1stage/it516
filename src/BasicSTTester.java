/*
 *
 *        Class: IT-516 - Data Structures & Algorithms
 *   Instructor: Sean Harrington
 *         Date: DD MON YYYY
 *      Student: John Smith
 *   Assignment: HW04
 *
 *      Purpose: Test an ordered Binary Search Symbol Table
 *               Use the algs4.jar implementation of the BinarySearchST Class
 *
 *      Compile: javac-algs4 BasicSTTester.java
 *
 *          Run: java-algs4 BasicSTTester < vowelsST.txt
 *               java-algs4 BasicSTTester < vowelsST.txt > BasicSTTesterOUTPUT.txt
 *
 */

import edu.princeton.cs.algs4.BinarySearchST;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BasicSTTester {
    public static void main(String[] args) {  // DO NOT HARDCODE A FILENAME HERE. USE ARGS!


        // Test 01 - Building the BinarySearchST
        StdOut.println();
        StdOut.println("Building a simple BinarySearchST");
        StdOut.println("Getting all items from file");
        StdOut.println("---------------------");
        BinarySearchST<String, Integer> test01 = new BinarySearchST<String, Integer>();
        for (int i = 0; !StdIn.isEmpty(); i++) {
            String key = StdIn.readString();
            test01.put(key, i);
        }
        StdOut.print("keys  = ");
        for (String s : test01.keys())
            StdOut.print(s + "  ");
        StdOut.println();
        StdOut.print("vals  = ");
        for (String s : test01.keys())
            StdOut.print(test01.get(s) + "  ");
        StdOut.println();

        // Test 02 - Testing size()
        // Test 03 - Testing put() for individual item
        // Test 04 - Testing size() again
        // etc...

    }
}
