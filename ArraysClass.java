/*
 * Project: ArraysClass.java
 * Description: Workng with Arrays class
 * Name: Jaehyung Lim
 * Date: Oct 28, 2015
 */

import java.util.Arrays;

public class ArraysClass {
  
  public static void printArray( int[] a ) {
    System.out.print( "Array: " );
    for( int i=0; i<a.length; i++ ){
      System.out.print( a[i] + "," );
    }
  }
  
  public static void main( String[] args ) {
    
    // Sort
    int b[] = { 1, 4, -3, 255, 17, 84, -127 };
    Arrays.sort(b);
    printArray(b);
    
    // Binary Search
    int index = Arrays.binarySearch( b,17 );
    System.out.println( "\n17 is index: " + index );
    
    // Equality:
    int x[] = { 1, 2, 3, 4, 5 };
    int y[] = { 1, 2, 3, 4, 5 };
    System.out.println( Arrays.equals( x, y ) );
    System.out.println( Arrays.equals( x, b ) );
    
    // Fill
    Arrays.fill( b, 17 );
    printArray(b);
  } // end main
  
} // end class