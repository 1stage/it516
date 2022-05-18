/*    Class: IT-516
 *     Date: DD MON YYYY
 *  Student: Sean Harrington
 *
 *  Task: Draw a series of input integers as bar graphs.
 *        First section is UNSORTED in red.
 *        Second section is SORTED in blue.
 *
 *  Note: Don't forget to add algs4.jar as a library to your project!
 *
 *  Compile:
 *  javac-algs4 RectangleChartStart.java
 *
 *  Run:
 *  java-algs4 RectangleChartStart 5 2 4 3 1
 *
 */

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.awt.*;

public class RectangleChartStart {
    public static void main(String[] args) {
        if (args.length > 3) {
            double myScalingFactor = 0.9;                         // The actual size of the bars being printed
            double myIncrement = (double) 1 / args.length / 2;
            int myMax = 0;
            Integer[] myArgs = new Integer[args.length];          // Create a new array from args[] that has actual Integers in it.
            for (int i = 0; i < args.length; i++) {
                myArgs[i] = Integer.parseInt(args[i]);
                if (myArgs[i] > myMax) {
                    myMax = myArgs[i];
                }
            }

            StdDraw.setCanvasSize(1000, 500);

            StdDraw.setPenColor(Color.RED);
            StdDraw.text(0.5, 0.85, "Unsorted");
            for (int i = 1; i <= args.length; i++) {
                double mySize = (double) myArgs[i - 1];
                mySize = mySize / myMax;
                StdDraw.setPenColor(Color.RED);
                StdDraw.filledRectangle((i * 2 * myIncrement) - myIncrement, 0.5 + (myIncrement * mySize * myScalingFactor), myIncrement * myScalingFactor, myIncrement * myScalingFactor * mySize);
                StdDraw.setPenColor(Color.BLACK);
                StdDraw.text((i * 2 * myIncrement) - myIncrement, 0.70, String.valueOf(myArgs[i - 1]));
            }

            // How are you going to sort the values?

            // How are you going to chart the bottom half with the sorted values?

        } else {
            StdOut.println("Need at least 4 integers given as command line arguments.");
        }
    }
}
