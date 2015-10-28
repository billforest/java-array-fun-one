/*
 * Project: ParallelArrays.java
 * Description: Using parallel Arrays and Array Methods
 * Name: Jaehyung Lim
 * Date: Oct 28, 2015
 */

import java.util.Scanner;    // gets User input
import java.util.Arrays;     // allows sorting and other things
import java.util.ArrayList;  // not using today (flexible arrays)

public class ParallelArrays {
  
  public static void printSplit( String[] split, String s ) {
    
    System.out.println( "Split String \""  + s + "\" is now: " );
    for ( int k=0; k<split.length; k++ ) {
      System.out.print( split[k] + ", " ); 
    }
    System.out.println( "=============================" );
  } // end printSplit
  
  public static void main( String[] args ) {
    
    // Create parallel arrays to input Student names + grades
    int numStudents = 4;  // sets array length
    String name[] = new String[ numStudents ];
    int grade[] = new int[ numStudents ];
    
    for ( int i = 0; i<numStudents; i++ ) {
     
      Scanner s1 = new Scanner( System.in );  // for names
          System.out.println( "Enter the student name: " );
          name[i] = s1.nextLine();
      
      Scanner s2 = new Scanner( System.in );  // for grades
          System.out.println( "Enter the student grade: " );
          grade[i] = s2.nextInt();
      
    }
    
    // print names + grades
    for ( int j = 0; j<numStudents; j++ ) {
     
      System.out.println( "GRADEBOOK WIZARD" );
      System.out.print( name[j] + ":\t" + grade[j] );
    }
    
    // split Strings into arrays
    String s = "Hello again", sp[];
    
    sp = s.split( "a" );       // sp[0] = "Hello "; sp[1] = "g"; sp[2] = "in"
    printSplit( sp, s );
    
    sp = s.split( "\\s" );     // split the whitespace
    printSplit( sp, s );
    
    sp = s.split( "e|g" );     // split e OR g
    printSplit( sp, s );
    
    sp = s.split( "a|g" );     // has some blank elements
    printSplit( sp, s );
    
    sp = s.split( "el|ai" );   
    printSplit( sp, s );
    
    
    
  } // end main
} // end class