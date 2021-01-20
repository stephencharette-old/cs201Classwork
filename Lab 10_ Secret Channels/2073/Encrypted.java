import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Encrypted {

   public static void main(String[] args) throws FileNotFoundException {
      Scanner scan = new Scanner( new File( args[0] ) );
      System.out.println( encoding(args[0] ) );
      
      
   }

   public static String encoding( String voiceData ) {
      int[] x = new int[ voiceData.length() ];
      for( int i = 0; i < voiceData.length(); i++ ) { 
         x[i] = Integer.parseInt( "" + voiceData.charAt( i ) );
         x[i] = (x[i]+5) % 10;
      }
      return ""+x[3]+x[2]+x[1]+x[0];
     
   }
}
