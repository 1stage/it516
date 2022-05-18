/******************************************************************************
 *      Student: Sean Harrington
 *         Date: DD MON YYYY
 *       Course: IT-516 Data Structures & Algorithms
 *   Assignment: HW10
 *
 *  Uses a RegEx to print out all matches from the input stream.
 *
 *  Compile...
 *  javac-algs4 Harvester.java
 *
 *  Use...
 *  java-algs4 Harvester "http://(\\w+\\.)*(\\w+)" https://www.cs.princeton.edu/
 *  java-algs4 Harvester "GCG(CGG|AGG)*CTG" chromosomeX.txt
 *
 ******************************************************************************/


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Harvester {
    public static void main(String[] args) {
        String regexp = args[0];
        In in = new In(args[1]);
        String input = in.readAll();
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            StdOut.println(matcher.group());
        }
    }
}
