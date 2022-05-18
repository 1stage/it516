/*    Class: IT-516 Data Structures & Algorithms
 *     Date: DD MON YYYY
 *  Student: YOUR NAME HERE
 *       HW: QU05
 *
 *  Task: Make four different colored squares dividing a grid
 *               and put four smaller circles of different colors
 *               on top of them.
 *
 *  Note: Don't forget to add algs4.jar as a library to your project!
 *
 *  Compile:
 *  javac-algs4 FourShapes.java
 *
 *  Run:
 *  java-algs4 FourShapes
 *
 */

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;


public class FourShapes {
    public static void main(String[] args) {
        // Draw the quarter-frame squares
        StdDraw.setPenColor(Color.RED);
        StdDraw.filledSquare(0.25, 0.25, 0.25);
        StdDraw.setPenColor(Color.GREEN);
        StdDraw.filledSquare(0.75, 0.25, 0.25);
        StdDraw.setPenColor(Color.BLUE);
        StdDraw.filledSquare(0.75, 0.75, 0.25);
        StdDraw.setPenColor(Color.YELLOW);
        StdDraw.filledSquare(0.25, 0.75, 0.25);
        // Draw the smaller circle in a different color
        StdDraw.setPenColor(Color.BLUE);
        StdDraw.filledCircle(0.25, 0.25, 0.125);
        StdDraw.setPenColor(Color.YELLOW);
        StdDraw.filledCircle(0.75, 0.25, 0.125);
        StdDraw.setPenColor(Color.RED);
        StdDraw.filledCircle(0.75, 0.75, 0.125);
        StdDraw.setPenColor(Color.GREEN);
        StdDraw.filledCircle(0.25, 0.75, 0.125);
    }
}
