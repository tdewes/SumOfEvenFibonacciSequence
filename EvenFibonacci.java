/*
 * Name: Tynan Dewes
 * Date: Febrary 9, 2015
 * Class Description: This class solves the Even Fibonacci numbers problem on 
 * projecteuler.net. This class completes the Fibonacci sequence up to the 
 * value four million. It adds all of the even numbers in this sequence and
 * displays the result. I chose this problem because it was related to what
 * we were most recently studying (recursive problems).
 */

import java.util.ArrayList;

public class EvenFibonacci {
  
/* Method name: fib
 * Purpose: This method recursively acquires the Fibonacci sequence by
 * recursively calling the method for the inputted index value -1 and -2. When
 * it reaches the base case of index equal to 0 or 1, it returns 1 and 0.
 * Parameters: int index which determines the index that the method will return
 * the value for.
 * Return: Returns the integer value of the Fibonacci sequence based on the
 * inputted index value.
 */
 
  private static int fib( int index ) {

     // Base case.
     if ( index == 0 ) {
       return 0; 
     }

     // Base case.
     else if ( index == 1 ) {
       return 1;
     }

     // Recursively calls the fib method.
     else {
       return fib( index - 1 ) + fib( index - 2 );
     }
   }

/* Method name: findSumOfEven 
 * Purpose: This method creates an ArrayList of Integer objects. It then enters
 * a for loop. As long as the nth index of the Fibonacci sequence is less than
 * 4 million, it gets the Fibonacci number for the index up to that point. If
 * this number is even, it adds it to the ArrayList. The method then goes 
 * through the ArrayList and adds the numbers in the ArrayList and prints the
 * final value.
 * Parameters: int max which determines the max number of the Fibonacci
 * sequence that will be used. 
 * Return: None. 
 */

  public static void findSumOfEven( int max ) {
    ArrayList<Integer> toCheck = new ArrayList<Integer>();

    // Holder.
    int toAdd = 0;

    int totalOfEven = 0;

    // Adds even numbers of the Fibonacci sequence before max to toCheck.
    for ( int n = 0; fib( n ) < max; n++ ) {
      toAdd = fib( n );

      // Check if the number is even.
      if ( toAdd % 2 == 0 ) {
        // If it's even, add it to the ArrayList.
        toCheck.add( toAdd );
      }

    }

    // Add the elements in the ArrayList.
    for ( int i = 0; i < toCheck.size(); i++ ) {
      totalOfEven += toCheck.get( i );
    }

    // Print the final value of the even numbers in the Fibonacci sequence.
    System.out.println( "" + totalOfEven );
  }

   // Runs method.
   public static void main(String[] args) {
     findSumOfEven( 4000000 );
   }
}
