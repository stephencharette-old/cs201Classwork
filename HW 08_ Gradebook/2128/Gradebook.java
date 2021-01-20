import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Gradebook{

   private static String[] labels;
   private static int[][] grades;
   
   public Gradebook( File file ) throws FileNotFoundException {
      
      Scanner scan = new Scanner( file );
      
      int n = scan.nextInt();
      int m = scan.nextInt();
      grades = new int[n][m];
      labels = new String[m];     
      for( int i = 0; i < m; i++ ) {
         labels[i] = scan.next();
      }
      for( int r = 0; r < n; r++ ) {        //r represents rows
         for( int c = 0; c < m; c++ ) {      //c represents columns
            grades[r][c] = scan.nextInt();
         }
      }
   }
   
   public static void print() {
      for( int i = 0; i < labels.length; i++ ) {   //prints the labels above the grades
         System.out.print( labels[i] + "\t" );
      }
      System.out.println( "Unweighted Average" );
      for( int r = 0; r < grades.length; r++ ) {
         double sum = 0;
         int c = 0;
         for( c = 0; c < grades[r].length; c++ ) {
            System.out.printf( "%-10s", grades[r][c] );
            sum += grades[r][c];
         }
         System.out.printf( "%.2f%n", sum / c );
      }
   }
   
   public static void main(String[] args) throws FileNotFoundException {
      File file = new File( args[0] );
      Gradebook gb = new Gradebook( file );
      gb.print();
   }

}
