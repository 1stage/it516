  /*    Class: IT-516
   *     Date: DD MON YYYY
   *  Student: Sean Harrington
   *
   *
   *  Task: Builds a MinPQ and removes the bottom items so that only the top n remain.
   *        Uses the command line int to determine n.
   *
   *  Compile:
   *  javac-algs4 TopM.java
   *
   *  Run:
   *  java-algs4 TopM 5 < cluBatch.txt
   *  java-algs4 TopM 10 < cluBatch.txt
   *
   */

  import edu.princeton.cs.algs4.*;

  public class TopM {
      public static void main(String[] args) {
          int m = Integer.parseInt(args[0]);
          MinPQ<Transaction> pq = new MinPQ<Transaction>(m + 1);
          while (StdIn.hasNextLine()) {
              pq.insert(new Transaction(StdIn.readLine()));
              if (pq.size() > m)
                  pq.delMin();
          }

          Stack<Transaction> stack = new Stack<Transaction>();
          while (!pq.isEmpty())
              stack.push(pq.delMin());
          for (Transaction transaction : stack)
              StdOut.println(transaction);
      }
  }
