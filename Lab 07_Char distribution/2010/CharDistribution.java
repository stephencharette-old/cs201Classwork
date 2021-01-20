import java.util.Scanner;
import java.io.*;

public class CharDistribution{

   public static void main(String[] args) throws FileNotFoundException{
      
      print( charCounting( new File( args[0] ) ) );  
      
      
   }
   
   public static int[] charCounting( String str ) {
      //counts number of times each of alpha char appears in a String.
      //A = 65 - 90 = Z
      int[] alpha = new int[26];
      String s = str.toUpperCase();
      for( int i = 0; i < s.length(); i++ ) {
         if( s.charAt(i) - 65 >= 0 && s.charAt(i) - 65 <= 26 ) {
            alpha[ s.charAt( i ) - 65 ]++;
         }
         //alpha[ s.charAt( i ) - 65 ]
      }
      return alpha;
   }
   
   public static int[] charCounting( File file ) throws FileNotFoundException{
      //counts number times alpha char appears in data file
      Scanner scan = new Scanner( file );
      String line = "";
      while( scan.hasNextLine() ) {
         line += scan.nextLine();
      }
      return charCounting( line );
   }
   
   public static void print( int[] c ) {
      //print the int array in format
      for( int i = 0; i < 26; i++ ) {
         System.out.println( (char)(i+65) + ": " + c[i] );
      }
   }

}
