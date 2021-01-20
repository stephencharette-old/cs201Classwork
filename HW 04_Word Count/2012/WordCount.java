import java.util.Scanner;
import java.io.*;

public class WordCount{

   public static void main(String[] args) throws FileNotFoundException{
      System.out.println( countWord( args[0], new File( args[1] ) ) );  
      
   }
   public static int countWord( String word, File file ) throws FileNotFoundException {
         int count = 0;
         Scanner input = new Scanner( file );
         String temp = "";
         while( input.hasNext() ) {
               if( word.equalsIgnoreCase( input.next() ) ) {
                  count++;
               }
         }
         return count;
      }

}
