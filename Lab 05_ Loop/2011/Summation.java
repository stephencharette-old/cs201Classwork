import java.util.Scanner;
import java.io.*;

public class Summation{

   public static void main(String[] args) throws FileNotFoundException{
      
      Scanner input = new Scanner( new File(args[0]) );  
      //Change argument index to reflect the file name in the argument list.
      //To do-file manipulation
      int total = 0;
      while( input.hasNextInt() ) {
         total += input.nextInt();
      }
      System.out.println( "The total from the file is: " + total );
      
   }

}
