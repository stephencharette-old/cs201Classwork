import java.util.Scanner;
import java.io.*;

public class LineCount{

   public static void main(String[] args) throws FileNotFoundException{
      
      System.out.println( countLine( new File(args[0]) ) );  
      //Change argument index to reflect the file name in the argument list.
      //To do-file manipulation
      
   }
   
   public static int countLine( File file ) throws FileNotFoundException {
      Scanner input = new Scanner( file );
      int count = 0;
      while( input.hasNextLine() ) {
         count++;
         input.nextLine();
      }
      return count;
   }

}
